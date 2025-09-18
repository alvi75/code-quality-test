public final void writeUnshared(Object object) throws IOException {
    writeObject(@object, false);
}