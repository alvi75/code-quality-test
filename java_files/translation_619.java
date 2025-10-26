ublic ParserExtension getExtension(String key) {
    if (key == null || !this.extensions.containsKey(key)) return null;
    return this.extensions.get(key);
}