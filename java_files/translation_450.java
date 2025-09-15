public ObjectIdSubclassMap<ObjectId> getNewObjectIds() {
    if (newObjectIds != null)return newObjectIds;
    return new ObjectIdSubclassMap<>();
}