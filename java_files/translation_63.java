public TokenStream create(TokenStream input) {
    return new DoubleMetaphoneFilter(input, maxCodeLength, inject);
}