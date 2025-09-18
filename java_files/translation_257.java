import java.util.*;

public class Translation257 {
    public TokenStream create(TokenStream input) {
    CommonGramsFilter commonGrams = new CommonGramsFilter(input, commonWords);
    return commonGrams;
}
}