public String toString() {
    String coll = collectionModel.getName();
    if (coll != null) {
        return "LM(" + coll + ")";
    }
    else {
        return "LM(" + getClass().getName() + ")";
    }
}