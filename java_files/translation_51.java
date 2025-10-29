import java.util.*;

public class Translation51 {
    ublic static List<CharsRef> UniqueStems(char[] word, int length){
    List<CharsRef> stems = Stem(word, length);
    if (stems.Count < 2){
        return stems;
    }
    CharSet terms = new CharSet();
    foreach (CharsRef s in stems){
        if (!terms.Contains(s)){
            terms.Add(s);
        }
    }
    List<CharsRef> deduped = new List<CharsRef>();
    foreach (CharsRef s in stems){
        if (!terms.Contains(s)){
            deduped.Add(s);
        }
    }
    return deduped;
}
}