import java.util.*;

public class Translation262 {
    ublic TokenStream create(TokenStream input) {
    return new ElisionFilter(input, articles);
}
}