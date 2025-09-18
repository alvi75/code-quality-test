public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[CFRULE]\n");
    buffer.append(" .cfRuleType =").append(HexDump.shortToHex(_cfRuleType)).append("\n");
    buffer.append(" .cfRuleStatus =").append(HexDump.shortToHex(_cfRuleStatus)).append("\n");
    buffer.append(" .cfRuleId =").append(HexDump.intToHex(_cfRuleId)).append("\n");
    buffer.append(" .cfmintrst =").append(HexDump.intToHex(_cfmintrst)).append("\n");
    buffer.append(" .maxintragroup =").append(HexDump.shortToHex(_maxintragroup)).append("\n");
    buffer.append(" .minintragroup =").append(HexDump.shortToHex(_minintragroup)).append("\n");
    buffer.append(" .outlinkoption =").append(HexDump.shortToHex(_outlinkoption)).append("\n");
    buffer.append(" .address =").append(getAddress()).append("\n");
    buffer.append("[/CFRULE]\n");
    return buffer.toString();
}