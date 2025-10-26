ublic String toString() {
    String coll = collectionModel.getName();
    if (coll != null) {
        return String.format("LM %s - %s", getName(), coll);
    }
    else {
        return String.format("LM %s", getName());
    }
}