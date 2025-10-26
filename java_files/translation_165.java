ublic override TokenStream Create(TokenStream input) {
    return new PortugueseStemFilter(input);
}