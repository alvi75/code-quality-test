public Ref peel(Ref ref) {
    try {
        return RefDatabase.getPeeled(ref);
    }
    catch (IOException e) {
        throw new UnpeeledException(ref, e);
    }
}