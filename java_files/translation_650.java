public CharSequence getFully(CharSequence key) {
    StringBuilder result = new StringBuilder(tries.size() * 2);
    for (int i = 0;
    i < tries.size();
    i++) {
        CharSequence r = tries.get(i).getFully(key);
        if (r == null || (r.length() == 1 && r.charAt(0) == EOM)) {
            return result;
        }
        result.append(r);
    }
    return result;
}