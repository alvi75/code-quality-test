public boolean equals(Object o) {
    if (!(o instanceof Property)) {
        return false;
    }
    Property p = (Property) o;
    final Object pValue = p.getValue();
    final long pId = p.getId();
    if (id != pId || (id != 0 && !typesAreEqual(type, p.getType())) {
        return false;
    }
    if (value == null && pValue == null) {
        return true;
    }
    if (value instanceof byte[]) {
        return Arrays.equals((byte[]) value, (byte[]) pValue);
    }
    return value.equals(pValue);
}