ublic override TokenStream Create(TokenStream input) {
    return new ElisionFilter(input, articles);
}