import java.util.*;

public class Translation257 {
    ublic override TokenStream Create(TokenStream input){
    var commonGrams = (CommonGramsFilter)base.Create(input);
    return new CommonGramsQueryFilter(commonGrams);
}
}