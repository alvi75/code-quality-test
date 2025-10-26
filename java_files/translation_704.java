ublic TextReader create(TextReader input) {
    return new PersianCharFilter(input);
}