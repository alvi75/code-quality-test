def split(s, platform='this'):
    """
	Split the input str under given platform, return the splitting result
    If platform equals 'this', auto-detect current platform.
    If platform equals 1, use POSIX style.
    If platform equals 0, use Windows/CMD style.
    Args:
        s: input str
        platform: 'this' = auto from current platform; 1 = POSIX; 0 = Windows/CMD
    Returns:
        a list of splitting str
	"""
    if platform == 'this':
        import psutil
        system = psutil.system()
        if system == 'Windows':
            platform = 0
        elif system in ['Linux', 'Darwin']:
            platform = 1

    if platform == 1:
        # POSIX compliant way of splitting path
        sep = '/'
        altsep = ':'
    else:
        # windows specific way of splitting path
        sep = '\\\\'
        altsep = '/'

    def _normcase(x):
        """Normalize case."""
        return x.lower()

    normcase = (lambda x: x) if not hasattr(os, "O_R_OK") \
        else _normcase

    drive, tail = os.path.splitdrive(s)
    head, tail = os.path.splitext(tail)

    res = []
    while True:
        head, tail = os.path.split(head)
        if not tail or tail == altsep:
            break
        res.append(tail)

    if not head:
        head = altsep
    if drive:
        res.insert(0, "%s:%s" % (drive, sep.join(res)))
    else:
        res.insert(0, sep.join(res))

    return [normcase(x.replace(altsep, sep)) for x in res]