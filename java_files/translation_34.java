public static String quote(String in) {
    StringBuilder r = new StringBuilder();
    r.append('\\');
    int start = 0, i = 0;
    for (;
    i < in.length();
    i++) {
        switch (in.charAt(i)) {
            case '\\':if (start<i-1)r.append(in, start, i);
            r.append('\\');
            break;
            default:r.append(in, start, i);
        }
    }
    return r.toString();
}