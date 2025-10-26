ublic ObjectIdSubclassMap<ObjectId> getNewObjectIds() {
    if (newObjectIds != null) {
        return newObjectIds;
    }
    return new ObjectIdSubclassMap<ObjectId>();
}