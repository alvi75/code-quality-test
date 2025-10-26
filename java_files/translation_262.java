import java.util.*;

public class Translation262 {
    public final TokenStream create(TokenStream input) {
    return new ElisionFilter(input, articles);
}
}