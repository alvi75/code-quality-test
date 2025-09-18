public static String toStringTree(final Tree t) {
    final List<String> names = new ArrayList<String>();
    toStringTree(t, names);
    return names.get(0);
}