import java.util.*;

public class Translation331 {
    public void addIfNoOverlap( WeightedPhraseInfo wpi ){
    for( WeightedPhraseInfo existWpi : phraseList ) {
        if( existWpi.isOffsetOverlap( wpi ) ) {
            existWpi.add( wpi );
            return;
        }
    }
    phraseList.add( wpi );
}
}