import java.util.*;

public class Translation331 {
    0;
int end = phrase.length - 1;
for (int i = start;
i <= end;
i++){
    String term = phrase[i];
    if (term == null){
        continue;
    }
    int offset = phraseOffsets[i];
    if (offset < 0 || offset >= phraseLength){
        throw new System.ArgumentException("Invalid phrase length");
    }
    if (i > start && offset <= lastOffset){
        throw new System.ArgumentException("Overlapping phrases not allowed");
    }
    lastOffset = offset;
    terms.add(term);
    termOffsets.add(offset);
}
}
return terms.toArray(new String[terms.size()]);
}
}