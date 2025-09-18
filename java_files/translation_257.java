public TokenStream create(TokenStream input) {
    CommonGramsFilter commonGrams = new CommonGramsFilter(input, commonWords);
    return commonGrams;
}