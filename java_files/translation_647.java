ublic String toFormulaString() {
    final String value = field_3_string;
    final int len = value.length();
    final StringBuilder sb = new StringBuilder(len + 4);
    sb.append(FORMULA_DELIMITER);
    for (int i = 0;
    i < len;
    i++) {
        final char c = value.charAt(i);
        if (c == FORMULA_DELIMITER) {
            sb.append(FORMULA_DELIMITER);
        }
        sb.append(c);
    }
    sb.append(FORMULA_DELIMITER);
    return sb.toString();
}