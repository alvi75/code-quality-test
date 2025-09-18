public Edit after(Edit cut) {
    return new Edit(beginA, cut.beginA, beginB, cut.beginB);
}