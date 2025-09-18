public Merger newMerger(Repository db) {
    return new InCoreMerger(db);
}