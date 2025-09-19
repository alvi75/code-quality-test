import java.util.*;

public class Translation331 {
    ublic void addIfNoOverlap( WeightedPhraseInfo wpi ){
    for( WeightedPhraseInfo existWpi : phraseList ){
        if( existWpi.isOffsetOverlap( wpi ) ){
            return;
        }
    }
    phraseList.add( wpi );
}
}