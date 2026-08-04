import java.util.*;

public class Translation63 {
    public TokenFilter create(TokenStream input) {
    return new DoubleMetaphoneFilter(input, maxCodeLength, inject);
}
}