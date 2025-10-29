import java.util.*;

public class Translation262 {
    01 public TokenStream create(TokenStream input) {
    return new ElisionFilter(input, articles);
}
}