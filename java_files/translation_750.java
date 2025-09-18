public boolean hasAll(RevFlagSet set) {
    return (flags & set.mask) == set.mask;
}