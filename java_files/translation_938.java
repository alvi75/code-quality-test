import java.util.*;

public class Translation938 {
    0;
int lo = 0;
int hi = mSize - 1;
while (lo <= hi){
    int mid = (lo + hi) >>> 1;
    int midKey = mKeys[mid];
    if (midKey < key){
        lo = mid + 1;
    }
    else if (midKey > key){
        hi = mid - 1;
    }
    else{
        return mid;
    }
}
return ~lo;
}
}