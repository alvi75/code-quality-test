def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Run a single command or a list of commands in a shell.

	:param commands: A string or a list of strings.
	:type commands: str | unicode | list[str]
	:param args: The arguments to pass to the command(s).
	:type args: list[str] | NoneType
	:param cwd: The working directory to execute the command(s) in.
	:type cwd: str | unicode | NoneType
	:param hide_stderr: Whether stderr should be hidden from view.
	:type hide_stderr: bool
	:param env: Environment variables to set before executing the command(s). If not specified, environment variables will be preserved.
	:type env: dict | NoneType

	:return: A tuple containing the output of the command(s), stdout, stderr and returncode.
	:rtype: tuple(str | unicode, int, int | NoneType)

	>>> print(run_command('ls', ['-l']))
	bash:~$ ls -l
	total 12
	rw-r--r-- 3 root root 1065 Oct 17  2014 test.sh
	rw-r--r-- 3 root root  980 Oct 17  2014 README.md
	rw-r--r-- 3 root root  637 Oct 17  2014 index.html
	rw-r--r-- 3 root root  637 Oct 17  2014 index.htm
	rw-r--r-- 3 root root  637 Oct 17  2014 index.html.gz
	w---r-------- 3 root root  127 Oct 17  2014 .DS_Store
	>>> print(run_command(['cat', 'README.md'], hide_stderr=True))
	bash:~$ cat README.md
	Total 12 lines, read in 0.00s, 12 bytes
	>>> print(run_command(['cat', 'README.md']))
	Total 12 lines, read in 0.00s, 12 bytes
	>>> print(run_command(['cat', 'README.md'], cwd='/home/annaho/code/python/microdrop'))
	Total 12 lines, read in 0.00s, 1