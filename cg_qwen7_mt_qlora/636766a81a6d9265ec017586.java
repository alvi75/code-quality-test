import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    /**Pop the given number of elements from the stack.**/
    private void pop(final int elements){
        if(elements > 0 && elements <= this.size()){
            for(int i = 1; i < elements; ++i){
                this.pop();
            }
        }else{
            throw new IllegalArgumentException("Cannot pop " + elements + " elements, only " + this.size() + " available");
        }
    }
}