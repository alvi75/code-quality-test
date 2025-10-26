ublic override TokenStream Create(TokenStream input) {
    return new DoubleMetaphoneFilter(input, maxCodeLength, inject);
}