ublic Stream openResource(String resource) throws IOException {
    InputStream stream = this.clazz.getTypeInfo().getAssembly().findAndGetManifestResourceStream(this.clazz, resource);
    if (stream == null) {
        throw new IOException("Resource not found: " + resource);
    }
    return stream;
}