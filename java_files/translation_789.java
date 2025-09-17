import java.util.*;

public class Translationtranslation_789 {
    public boolean lessThan(TextFragment fragA, TextFragment fragB) {
        if (fragA.score == fragB.score) {
            return fragA.fragNum > fragB.fragNum;
        }
        return fragA.score < fragB.score;
    }
}