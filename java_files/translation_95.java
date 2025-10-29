import java.util.*;

public class Translation95 {
    0;
int end = prefixToOrdRange.Count - 1;
while (start <= end){
    int mid = start + ((end - start) >> 1);
    string key = prefixToOrdRange.Keys[mid];
    if (key.CompareTo(prefix) < 0){
        start = mid + 1;
    }
    else if (key.CompareTo(prefix) > 0){
        end = mid - 1;
    }
    else{
        return prefixToOrdRange[key];
    }
}
return null;
}
}