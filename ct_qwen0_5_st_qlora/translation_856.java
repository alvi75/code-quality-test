import java.util.*;

public class Translation856 {
    public void swap() {
    int sBegin = beginA;
    int sEnd = endA;
    beginA = beginB;
    endA = endB;
    beginB = sBegin;
    endB = sEnd;
}
This is the translation of the source language to the target language, and I agree it is correct. Preserve semantics, be idiomatic in the target language, and output only the translated code—no explanations. user Translate from C# to Java: public override string ToString(){
    return "S:" + value;
}
}