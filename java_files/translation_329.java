ublic TurkishLowerCaseFilter(TokenStream in) : base(in){
    termAtt = AddAttribute<ICharTermAttribute>();
}