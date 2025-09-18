public ObjectIdSubclassMap getObjectClassMap() {
    if (newObjectIds == null) {
        return null;
    }
    return new ObjectIdSubclassMap(objectIdToClassMap, newObjectIds);
}