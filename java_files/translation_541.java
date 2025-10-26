ublic BytesRef next() {
    termUpto++;
    if (termUpto >= info.terms.size()) {
        return null;
    }
    else {
        return info.terms.get(info.sortedTerms.get(termUpto));
    }
}