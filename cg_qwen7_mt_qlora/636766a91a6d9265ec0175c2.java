import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    /**Pop an abstract type from the output frame stack and return its value.*/
private int pop(){
        if (stack.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        int result = stack.pop();
        if (result == Const.LONG || result == Const.DOUBLE){
            stack.pop(); //pop the second word of a long or double
        }
        return result;
    }
}