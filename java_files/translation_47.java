public void reset() {
    if (!first()) {
        ptr = 0;
        if (!eof())parseEntry();
    }
}