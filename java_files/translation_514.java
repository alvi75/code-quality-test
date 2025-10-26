ublic XPath(Parser parser, String path) {
    this.parser = parser;
    this.path = path;
    elements = Split(path);
}