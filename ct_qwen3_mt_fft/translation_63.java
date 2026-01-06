import java.util.*;

public class Translation63 {
    1 public DoubleMetaphoneFilter create(TokenStream input) {
    return new DoubleMetaphoneFilter(input, maxCodeLength, inject);
}
}