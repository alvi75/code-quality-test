ublic void setReadOnly(boolean readOnly) {
    if (this.readOnly && !readOnly) {
        throw new IllegalStateException("can't alter readonly IntervalSet");
    }
    this.readOnly = readOnly;
}