import java.util.*;

public class Translation329 {
    0;
int end = termAtt.Length();
for (int i = start;
i < end;
i++){
    char c = termAtt[i];
    if (c >= 'A' && c <= 'Z'){
        termAtt[i] = (char)(c + ('a' - 'A'));
    }
}
}
}