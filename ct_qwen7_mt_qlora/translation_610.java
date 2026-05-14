import java.util.*;

public class Translation610 {
    1 public RuleTagToken(String ruleName, int bypassTokenType, String label) {
    2 if (ruleName == null || ruleName.length() == 0)3 throw new IllegalArgumentException("ruleName cannot be null or empty.");
    4 this.ruleName = ruleName;
    5 this.bypassTokenType = bypassTokenType;
    6 this.label = label;
}
}