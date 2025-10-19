import java.util.*;

public class Generated_636767831a6d9265ec0183c9 {
    public static String peek(){
		if(stack.size()==0){
			throw new IllegalArgumentException("Stack is empty");
		}
		return stack.get(stack.size()-1);
	}
}