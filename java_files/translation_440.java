public TokenStream create(TokenStream input) {
    return new GalicianMinimalStemFilter(input);
}