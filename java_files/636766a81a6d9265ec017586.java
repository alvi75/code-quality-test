import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    private void pop(final int elements){
		if(elements < 0 || elements > stack.size()){
			throw new IllegalArgumentException("Invalid number of elements to be popped: "+elements);
		}
		
		for(int i=0; i<elements; i++){
			stack.pop();
		}
	}
}