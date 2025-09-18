public MessageWriter() {
    buf = new ByteArrayOutputStream();
    enc = new OutputStreamWriter(buf,UTF_8);
}