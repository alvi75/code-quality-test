import java.util.*;

public class Translation63 {
    ublic TokenStream create(TokenStream input) {
    return new DoubleMetaphoneFilter(input, maxCodeLength, inject);
}
}