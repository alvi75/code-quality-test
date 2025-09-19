import java.util.*;

public class Translation824 {
    ublic TokenStream create(TokenStream input) {
    return new ReverseStringFilter(input);
}
}