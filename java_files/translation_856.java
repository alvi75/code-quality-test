public void swap() {
    final int sBegin = beginA;
    sint sEnd = endA;
    beginA = endB;
    endA = sEnd;
    beginB = sBegin;
    endB = sEnd;
}