public TokenStream create(TokenStream input) {
    return new PortugueseStemFilter(input);
}