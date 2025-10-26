ublic override TokenStream Create(TokenStream input) {
    return new EnglishPossessiveFilter(LuceneVersion.LUCENE_30, input);
}