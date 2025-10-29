import java.util.*;

public class Translation629 {
    0;
int i = 0;
while (i < excludes.length) {
    String exclude = excludes[i];
    if (name.startsWith(exclude)) {
        throw new FileNotFoundException(name);
    }
    i++;
}
Entry entry = directory.getEntry(name);
return wrapEntry(entry);
}
}