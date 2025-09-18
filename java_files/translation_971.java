public boolean isSuccessful() {
    if (mergeResult == null) {
        return false;
    }
    return mergeResult.isSuccessful();
}