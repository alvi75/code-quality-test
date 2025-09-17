public ObjectIdSubclassMap<ObjectId> getBaseObjectIds() {
    if (baseObjectIds != null)return baseObjectIds;
    return new ObjectIdSubclassMap<>(ObjectId.class);
}