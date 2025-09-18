public CachingDoubleValueSource(ValueSource source) {
    this.source = source;
    this.cache = new HashMap<>();
}