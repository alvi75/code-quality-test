ublic ObjectStream openStream() throws IOException {
    WindowCursor wc = new WindowCursor(this.db);
    InputStream @in;
    try {
        if (pack != null) {
            @in = new PackInputStream(pack, objectOffset + headerLength, wc);
        }
        else {
            @in = new InflaterInputStream(new Inflater(), wc.Inflater(), 8192);
        }
    }
    catch (IOException e) {
        return wc.open(getObjectId(), type).openStream();
    }
    try {
        return new ObjectStream.Filter(type, size, @in);
    }
    catch (IOException e) {
        throw e;
    }
}