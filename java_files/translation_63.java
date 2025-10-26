import java.util.*;

public class Translation63 {
    public TokenStream create(TokenStream input) {
    return new DoubleMetaphoneFilter(input, maxCodeLength, inject);
}
}