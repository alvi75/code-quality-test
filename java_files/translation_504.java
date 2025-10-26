ublic override String toString(){
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FtCbls ]\n");
    buffer.append(" size = ").append(DataSize).append("\n");
    buffer.append(" reserved = ").append(HexDump.toHex(reserved)).append("\n");
    buffer.append("[/FtCbls ]\n");
    return buffer.toString();
}