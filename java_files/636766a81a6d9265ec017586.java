import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    private void pop(final int elements){
		if(elements > this.stack.size()){
			throw new IllegalArgumentException("Too many elements to pop");
		}
		
		for(int i = 0; i < elements; ++i){
			this.stack.pop();
		}
	}
}