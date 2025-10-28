import java.util.*;

public class Translation307 {
    1 public boolean incrementToken() {
    if (termAtt == null) {
        termAtt = addAttribute(IAttributeFactory.TERMINAL_ATTRIBUTE);
    }
    termAtt.setEmpty();
    termAtt.append("");
    return false;
}
}