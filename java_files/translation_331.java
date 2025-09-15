import java.util.*;

public class Translationtranslation_331 {
    public void addIfNoOverlap( WeightedPhraseInfo wpi ){
        Iterator<WeightedPhraseInfo> ite = getIterator();
        if ( !ite.hasNext() ) {
            return;
        }
        WeightedPhraseInfo last = ite.next();
        if ( last.isOffsetOverlap( wpi ) ) {
            wpi.setTerm( last.getTerm() );
            return;
        }
        while ( true ) {
            WeightedPhraseInfo pi = ite.next();
            if ( pi.isWholePhrase() ) {
                wpi.add( pi );
                continue;
            }
            if ( pi.equals( wpi ) ) {
                continue;
            }
            int weight = pi.getWeight();
            if ( weight == 0 ) {
                break;
            }
            if ( weight > hightestWeight ) {
                hightestWeight = weight;
                break;
            }
            if ( hightestWeight != weight ) {
                assert false: "high weight=" + hightestWeight + " vs weight=" + weight;
            }
            wpi.add( pi );
        }
    }
}