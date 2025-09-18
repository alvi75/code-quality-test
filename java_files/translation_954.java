public Merger newMerger(Repository db) {
    return new OneSide(db, treeIndex);
}