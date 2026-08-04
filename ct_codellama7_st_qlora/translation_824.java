import java.util.*;

public class Translation824 {
    public TokenStream create(TokenStream input) {
    return new ReverseStringFilter(input);
}
}