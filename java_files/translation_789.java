import java.util.*;

public class Translation789 {
    ublic boolean lessThan(TextFragment fragA, TextFragment fragB) {
    if (fragA.score == fragB.score) {
        return fragA.fragNum > fragB.fragNum;
    }
    return fragA.score < fragB.score;
}
}