import java.util.*;

public class Translationtranslation_789 {
    public boolean lessThan( TextFragment frag1, TextFragment frag2 ){
        if ( frag1.score == frag2.score )return frag1.fragmentNumber > frag2.fragmentNumber;
        elsereturn frag1.score < frag2.score;
    }
}