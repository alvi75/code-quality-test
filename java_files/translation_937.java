public synchronized DirectoryReader getIndexReader() {
    if (indexReader != null) {
        indexReader.incRef();
    }
    return indexReader;
}