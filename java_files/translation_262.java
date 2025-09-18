public TokenStream create(TokenStream input) {
    return new ElisionFilter(input, articles);
}