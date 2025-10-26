ublic Merger newMerger(Repository db) {
    return new StrategyOneSided.OneSide(db, treeIndex);
}