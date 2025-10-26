ublic override TokenStream Create(TokenStream input){
    var commonGrams = (CommonGramsFilter)base.Create(input);
    return new CommonGramsQueryFilter(commonGrams);
}