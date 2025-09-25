import java.util.*;

public class Translation789 {
    public boolean lessThan(TextFragment fragA, TextFragment fragB) {
    if (fragA.getScore() == fragB.getScore())return fragA.getFragNum()> fragB.getFragNum();
    elsereturn fragA.getScore()< fragB.getScore();
}
}