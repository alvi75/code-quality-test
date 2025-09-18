public Reader create(Reader input) {
    return new PersianCharFilter(input,prefixAnalyzer,prefix);
}