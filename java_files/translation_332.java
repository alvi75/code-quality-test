ublic Merger newMerger(Repository db) {
    return new StrategySimpleTwoWayInCore.InCoreMerger(db);
}