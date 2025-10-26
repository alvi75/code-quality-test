ublic override TokenStream Create(TokenStream input) {
    return new GalicianMinimalStemFilter(input);
}