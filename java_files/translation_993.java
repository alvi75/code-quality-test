ublic String toString() {
    StringBuilder s = new StringBuilder();
    s.append(type);
    s.append(' ');
    s.append(name);
    s.append(' ');
    s.append(commitTime);
    s.append(' ');
    appendCoreFlags(s);
    return s.toString();
}