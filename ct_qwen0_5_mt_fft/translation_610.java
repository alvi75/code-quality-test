import java.util.*;

public class Translation610 {
    public RuleTagToken(String ruleName, int bypassTokenType, String label) {
    if (label == null || label.isEmpty()) {
        throw new IllegalArgumentException("label cannot be null or empty.");
    }
    this.ruleName = ruleName;
    this.bypassTokenType = bypassTokenType;
    this.label = label;
}
}