public final Stream openResource(String resource) throws IOException {
    final URL url = clazz.getURL(resource);
    final InputStream is = null;
    try {
        is = url.openStream();
    }
    catch (ConnectException ce) {
        throw new ConnectException(ce.getMessage() + resource);
    }
    if (is.available()) {
        return is;
    }
    throw new IOException(MessageFormat.format(JGitText.get().couldNotReadResource, resource));
}