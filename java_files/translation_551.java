ublic boolean canAppendMatch() {
    for (int i = 0;
    i < heads.size();
    i++) {
        if (heads.get(i) != LAST_HEAD.INSTANCE) {
            return true;
        }
    }
    return false;
}