public TokenStream create(TokenStream input) {
    return new GermanMinimalStemFilter(input);
}