import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_331 {
    public void addIfNoOverlap( WeightedPhraseInfo wpi ){
        for( WeightedPhraseInfo existWpi : phraseList ){
            if( existWpi.isOffsetOverlap( wpi ) ){
                return;
            }
        }
        phraseList.add( wpi );
    }
}