public TokenStream create(TokenStream input) {
    return new ReverseStringFilter(input);
}