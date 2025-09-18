public TokenStream create(TokenStream input) {
    return new HyphenatedWordsFilter(input);
}