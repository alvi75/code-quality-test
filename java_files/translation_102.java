ublic override TokenStream Create(TokenStream input) {
    return new HyphenatedWordsFilter(input);
}