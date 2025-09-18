public TokenStream create(TokenStream input) {
    return new RussianLightStemFilter(input);
}