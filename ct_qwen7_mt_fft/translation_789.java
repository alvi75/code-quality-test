import java.util.*;

public class Translation789 {
    public boolean lessThan(TextFragment fragA, TextFragment fragB) {
    if (fragA.getScore() == fragB.getScore())return fragA.getFragCharSize() > fragB.getFragCharSize();
    elsereturn fragA.getScore() < fragB.getScore();
}
}