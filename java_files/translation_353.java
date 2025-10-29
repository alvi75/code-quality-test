import java.util.*;

public class Translation353 {
    0;
int c = buffer.Read();
if (c == -1) {
    return;
}
char ch = (char)c;
if (normalizeKanji && isKanji(ch)) {
    ch = ' ';
}
else if (normalizeKana && isKana(ch)) {
    ch = ' ';
}
output.Write((byte)ch);
}
}