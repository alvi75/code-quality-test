import java.util.*;

public class Translation51 {
    0, 0, dictionary.ignoreCase);
try {
    for (int i = 0;
    i < stems.Length;
    i++) {
        if (!terms.Contains(stems[i])) {
            deduped.Add(stems[i]);
            terms.Add(stems[i]);
        }
    }
}
finally {
    terms.Dispose();
}
return deduped;
}
}