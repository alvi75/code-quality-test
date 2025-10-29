import java.util.*;

public class Translation577 {
    0;
int end = offset + length;
if (end > text.Length)return false;
for (int i = offset;
i < end;
i++){
    if (!map.ContainsKey(text[i]))return false;
}
return true;
}
}