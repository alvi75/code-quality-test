import java.util.*;

public class Translation262 {
    ublic override TokenStream Create(TokenStream input) {
    return new ElisionFilter(input, articles);
}
}