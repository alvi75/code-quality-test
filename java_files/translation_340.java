public DirCacheEntry getDirCacheEntry() {
    return currentSubtree == null ? currentEntry : null;
}