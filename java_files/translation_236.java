ublic Ref peel(Ref ref) throws IOException {
    try {
        return RefDatabase.peel(ref);
    }
    catch (IOException e) {
        return ref;
    }
}