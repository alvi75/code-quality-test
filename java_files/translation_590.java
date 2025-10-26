ublic CachingDoubleValueSource(ValueSource source) {
    this.source = source;
    cache = new HashMap<>();
}