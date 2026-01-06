import java.util.*;

public class Translation991 {
    public SinglePositionTokenStream(String word) {
    termAttr = addAttribute(CharTermAttribute.class);
    posIncrAtt = addAttribute(PositionIncrementAttribute.class);
    this.word = word;
    returned = true;
}
}