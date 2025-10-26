ublic String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0;
    i < size;
    ++i) {
        if (sb.length() > 1) {
            sb.append(", ");
        }
        sb.append(items[i]);
    }
    return sb.append(']').toString();
}