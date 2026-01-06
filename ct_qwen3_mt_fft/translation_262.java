import java.util.*;

public class Translation262 {
    1 public TokenStream create(TokenStream input) {
    return new ElisionFilter(input, articles);
}
}