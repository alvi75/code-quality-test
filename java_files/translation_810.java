public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FILESHARING]\n");
    buffer.append(" .readOnly = ").append(getReadOnly()).append("\n");
    buffer.append(" .password = ").append(HexDump.toHex(getPassword())).append("\n");
    buffer.append(" .username = ").append(getUsername()).append("\n");
    buffer.append("[/FILESHARING]\n");
    return buffer.toString();
}