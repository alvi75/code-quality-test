ublic WAH8DocIdSet build() {
    if (this.wordNum != -1) {
        addWord(wordNum, (byte)word);
    }
    return super.build();
}