ublic String toString() {
    StringBuilder builder = new StringBuilder();
    int length = this.length;
    builder.append(Path.DirectorySeparatorChar);
    for (int i = 0;
    i < length;
    i++) {
        builder.append(getComponent(i));
        if (i < (length - 1)) {
            builder.append(Path.DirectorySeparatorChar);
        }
    }
    return builder.toString();
}