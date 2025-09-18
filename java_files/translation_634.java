public static TagOpt fromOption(String o) {
    if (o == null || o.length() == 0)return AUTO_FOLLOW;
    final CharArraySet set = new CharArraySet(1);
    set.add(o);
    while (set.size() != 0) {
        final Option opt = set.remove(set.last());
        if (opt instanceof OptionWithValue) {
            final Option v = (Option) opt;
            final String s = v.getValue();
            if (s.equals(""))break;
            set.remove(v);
            v.setHidden(true);
        }
    }
    return set.last();
}