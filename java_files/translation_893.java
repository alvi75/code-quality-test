public TokenStream create(TokenStream input) {
    return new EnglishPossessiveFilter(input);
}