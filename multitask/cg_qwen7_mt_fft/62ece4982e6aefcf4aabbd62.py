def _replace_url_args(url, url_args):
    """
    Replace the value in url with the value in url_args
    If url_args has a value, iterate over the keys and values from url_args.
    Then replace the keys of the first parameter with values.
    Returns: the modified url.

    """

    if not url_args:
        return url

    # Split the URL into parts to check for query string parameters
    split = urllib.parse.urlsplit(url)

    # Reconstructing using only scheme, netloc and path information,
    # we leave out query and fragment since they will be replaced by our args
    reconstructed = urllib.parse.urlunsplit(
        (split.scheme, split.netloc, split.path, '', ''))

    new_parts = []
    for part in reconstructed.split('&'):
        key_value = part.split('=')
        try:
            key = unquote_plus(key_value[0])
            val = None if len(key_value) == 1 else unquote_plus(key_value[1])
            new_parts.append('{}={}'.format(key, val))
        except IndexError as e:
            raise ValueError('Invalid arguments passed')

    updated_query_string = '&'.join(new_parts)

    final_url = '{}&{}'.format(split.geturl(), updated_query_string)

    return final_url.format(**url_args)