import java.util.*;

public class Translation789 {
    protected boolean lessThan(TextFragment fragA, TextFragment fragB) {
    if (fragA.score == fragB.score)return fragA.fragmentNumber > fragB.fragmentNumber;
    else return fragA.score < fragB.score;
}
}