import java.util.*;

public class Translation63 {
    1 public TokenStream create(TokenStream input) {
    2 return new DoubleMetaphoneFilter(input, maxCodeLength, inject);
}
}