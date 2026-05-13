def was_processed(processed, path_name, verbose):
    """
    Check if a file or directory has already been processed.

    To prevent recursion, expand the path name to an absolution path
    call this function with a set that will store all the entries and
    the entry to test. If the entry is already in the set, report the issue
    and return ``True``. Otherwise, add the entry to the set and return
    ``False`` to allow the path to be processed.

    Args:
        processed: Set to store processed pathnames
        path_name: Path to a directory or file
        verbose: True if verbose output is requested

    Returns:
        True if it's already in the set. False if not.
	"""

    abspath = os.path.abspath(path_name)

    # If we've seen this absolute pathname before...
    if abspath in processed:

        # ...report the duplicate (unless it's a directory)
        if not os.path.isdir(abspath):

            msg.dupe(verbose, abspath)
            return True

        else:

            # It's a directory; recurse into it
            for dirname, subdirs, files in os.walk(abspath):

                # Process each of its contents
                for f in chain(subdirs, files):
                    was_processed(processed, os.path.join(dirname, f), verbose)

    # Remember that we have now processed this pathname
    processed.add(abspath)

    return False