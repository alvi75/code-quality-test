ublic short getGB2312Id(char ch) throws IOException {
    try {
        byte[] buffer = new byte[2];
        buffer[0] = (byte)ch;
        buffer[1] = (byte)ch;
        if (buffer.length != 2) {
            return -1;
        }
        int b0 = (buffer[0] & 0x0FF) - 161;
        int b1 = (buffer[1] & 0x0FF) - 161;
        return (short)(b0 * 94 + b1);
    }
    catch (IllegalArgumentException e) {
        throw new IOException(e.toString(), e);
    }
}