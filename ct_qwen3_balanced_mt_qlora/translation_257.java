import java.util.*;

public class Translation257 {
    ublic CommonGramsQueryFilter create(TokenStream input) {
    final CommonGramsFilter commonGrams = new CommonGramsFilter(getConfig().getWordFiles(), input);
    return new CommonGramsQueryFilter(commonGrams);
}
}