import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    private void pop(final int elements){
        if(elements > 0 && elements <= this.stack.size()){
            for(int i = 0; i < elements; i++){
                this.stack.remove(this.stack.size() - 1);
            }
        }else{
            throw new IllegalArgumentException("Cannot pop " + elements + " elements, only " + this.stack.size() + " available");
        }
    }
}