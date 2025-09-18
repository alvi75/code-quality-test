public XPath(Parser parser,String path) {
    this.parser = parser;
    this.path = path;
    this.elements = split(path);
}