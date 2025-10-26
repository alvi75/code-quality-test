ublic void write(char[] buffer, int offset, int len) {
    Arrays.checkOffsetAndCount(buffer.length, offset, len);
    synchronized (lock) {
        expand(len);
        System.arraycopy(buffer, offset, buf, count, len);
        count += len;
    }
}