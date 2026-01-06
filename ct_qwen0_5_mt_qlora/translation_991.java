import java.util.*;

public class Translation991 {
    public SinglePositionTokenStream(String word) {
    termAtt = addAttribute(CharTermAttribute.class);
    posIncrAtt = addAttribute(POSITIONINCREMENTER_ATTRIBUTE);
    this.word = word;
    returned = true;
}
}