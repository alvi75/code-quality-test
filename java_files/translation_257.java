import java.util.*;

public class Translation257 {
    ublic TokenStream create(TokenStream input) {
    CommonGramsFilter commonGrams = super.create(input);
    return new CommonGramsQueryFilter(commonGrams);
}
}