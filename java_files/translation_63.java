import java.util.*;

public class Translation63 {
    ublic override TokenStream Create(TokenStream input) {
    return new DoubleMetaphoneFilter(input, maxCodeLength, inject);
}
}