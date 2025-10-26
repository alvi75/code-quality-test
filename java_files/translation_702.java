ublic void next(int delta) {
    while (--delta >= 0) {
        if (currentSubtree != null) {
            ptr += currentSubtree.getEntrySpan();
        }
        else {
            ptr++;
        }
        if (eof) {
            break;
        }
        parseEntry();
    }
}