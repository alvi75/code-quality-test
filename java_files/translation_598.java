public ObjectIdSubclassMap getObjectBaseIds() {
    if (baseObjectIds != null) {
        return baseObjectIds;
    }
    return new ObjectIdSubclassMap();
}