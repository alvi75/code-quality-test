ublic void addIfNoOverlap(WeightedPhraseInfo wpi) {
    for (WeightedPhraseInfo existWpi : phraseList) {
        if (existWpi.isOffsetOverlap(wpi)) {
            existWpi.addTermsInfos(wpi.getTermsInfos());
            return;
        }
    }
    phraseList.add(wpi);
}