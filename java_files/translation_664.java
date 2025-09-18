public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SXVDEX]\n");
    buffer.append(" .grbit1 =").append(HexDump.intToHex(_grbit1)).append("\n");
    buffer.append(" .grbit2 =").append(HexDump.byteToHex(_grbit2)).append("\n");
    buffer.append(" .citmShow =").append(HexDump.byteToHex(_citmShow)).append("\n");
    buffer.append(" .isxdiSort =").append(HexDump.shortToHex(_isxdiSort)).append("\n");
    buffer.append(" .isxdiShow =").append(HexDump.shortToHex(_isxdiShow)).append("\n");
    buffer.append(" .subName =").append(_name).append("\n");
    buffer.append("[/SXVDEX]\n");
    return buffer.toString();
}