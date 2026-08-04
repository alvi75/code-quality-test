import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    private void pop(final int elements){
        if(elements < 0){
            throw new IllegalArgumentException("Cannot pop negative number of elements");
        }
        if(elements > stack.size()){
            throw new IllegalArgumentException("Cannot pop more elements than are on the stack");
        }
        for(int i = 0; i < elements; i++){
            stack.remove(stack.size() - 1);
        }
    }
}