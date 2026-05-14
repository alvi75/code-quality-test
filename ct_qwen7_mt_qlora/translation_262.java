import java.util.*;

public class Translation262 {
    1 public TokenStream create(TokenStream input) {
    2 return new ElisionFilter(input, articles);
}
}