ublic MessageWriter() {
    buf = new ByteArrayOutputStream();
    enc = new OutputStreamWriter(getRawStream(), CHARSET);
}