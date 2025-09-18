public GroupingSearch disableCaching() {
    this.maxCacheRAMMB = null;
    this.maxDocsToCache = null;
    return this;
}