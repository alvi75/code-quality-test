public ObjectIdSubclassMap getObjectClassMap() {
    if (objectClassMap == null) {
        objectClassMap = new ObjectIdSubclassMap<>();
    }
    return objectClassMap;
}