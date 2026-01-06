import java.util.*;

public class Translation991 {
    public SinglePositionTokenStream(String word) {
    termAtt = addAttribute(CharTermAttribute.class);
    posIncAtt = addAttribute(PositionIncrementAttribute.class);
    this.word = word;
    returned = true;
}
}