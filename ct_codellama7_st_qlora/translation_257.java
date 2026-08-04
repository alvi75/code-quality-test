import java.util.*;

public class Translation257 {
    public TokenStream create(TokenStream input) {
    return new CommonGramsQueryFilter(input, commonWords);
}
}