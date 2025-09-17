public ObjectIdSubclassMap getNewObjectIds() {
    if (newObjectIds != null)return newObjectIds;
    return new ObjectIdSubclassMap();
}