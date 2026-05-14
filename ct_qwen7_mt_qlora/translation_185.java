import java.util.*;

public class Translation185 {
    public final int end(int index){
    if (index < 0 || index >= this.size()){
        throw new IndexOutOfBoundsException("Index: " + index);
    }
    return this.end[index];
}
}