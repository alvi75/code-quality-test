import java.util.*;

public class Translation610 {
    public RuleTagToken(String ruleName, int bypassTokenType, String label) {
    if (null == ruleName || 0 == ruleName.length()) {
        throw new IllegalArgumentException("ruleName cannot be null or empty.");
    }
    this.ruleName = ruleName;
    this.bypassTokenType = bypassTokenType;
    this.label = label;
}
}