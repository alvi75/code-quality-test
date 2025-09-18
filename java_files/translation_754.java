public void removeName(Name name) {
    int index = getNameIndex((HSSFName) name);
    removeName(index);
}