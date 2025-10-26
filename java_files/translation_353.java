ublic JapaneseIterationMarkCharFilter(TextReader input, boolean normalizeKanji, boolean normalizeKana) {
    super(input);
    this.normalizeKanji = normalizeKanji;
    this.normalizeKana = normalizeKana;
}