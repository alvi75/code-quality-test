ublic int getCells() {
    int size = 0;
    for (char c : cells.keySet()) {
        Cell e = cells.get(c);
        if (e.cmd >= 0 || e.ref >= 0) {
            size++;
        }
    }
    return size;
}