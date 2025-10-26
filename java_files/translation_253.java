ublic int readUShort() {
    final int ch1 = readUByte();
    final int ch2 = readUByte();
    return (ch2 << 8) + (ch1 << 0);
}