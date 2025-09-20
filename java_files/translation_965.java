import java.util.*;

public class Translation965 {
    ublic void set(int index, long n) {
    if (count < index)throw new ArrayIndexOutOfBoundsException(index);
    else if (count == index)add(n);
    elseentries[index] = n;
}
}