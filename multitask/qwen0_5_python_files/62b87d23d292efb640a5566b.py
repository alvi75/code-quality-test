def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	if not isinstance(commands, (list, tuple)):
		commands = [commands]
	if not isinstance(args, (list, tuple)):
		args = [args]

	# Run commands in a new process.
	p = Popen(commands, stdout=PIPE, stderr=PIPE, shell=True)
	out, err = p.communicate()
	if p.returncode:
		raise CalledProcessError(p.returncode, " ".join(commands), out=out, err=err)

	# If we're running in a subprocess, let's print it to the console.
	if os.fork():
		import sys
		sys.stdout.write(out.decode('utf-8'))
		sys.stdout.flush()

	# If we're being called from the parent process, return the output.
	if not hide_stderr:
		return out

	# Otherwise, just return the exit code.
	return p.returncode