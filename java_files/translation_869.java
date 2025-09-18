public void write(int oneByte) throws IOException {
    write(new byte[] {
        (byte) oneByte }
        , 0, 1);
    }