public List<Head> getNextHeads(char c) {
    if ( matches(c) ) return newHeads;
    elsereturn FileNameMatcher.EMPTY_HEAD_LIST;
}