public void addIfNoOverlap( WeightedPhraseInfo wpi ){
    Iterator<WeightedPhraseInfo> ite = getIterator();
    if ( !ite.hasNext() ) {
        return;
    }
    WeightedPhraseInfo existWpi = ite.next();
    while ( existWpi.isOffsetOverlap( wpi ) ) {
        existWpi.setFirstTerm( wpi.getFirstTerm() );
        existWpi.setLastTerm( wpi.getLastTerm() );
    }
    else if ( existWpi.compareTo( wpi ) < 0 ) {
        throw new IllegalArgumentException( "cannot have WPI " + wpi+ " after term " + existWpi.getFirstTerm() + " in phrase " + existWpi.getPhraseText() + " (terms: " + existWpi.getTermsList() + ")";
    }
    else if ( existWpi.compareTo( wpi ) > 0 ) {
        throw new IllegalArgumentException( "cannot have WPI " + wpi+ " before term " + existWpi.getLastTerm() + " in phrase " + existWpi.getPhraseText() + " (terms: " + existWpi.getTermsList() + ")";
    }
}
}