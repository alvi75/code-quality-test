import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    private int pop(){
        if (stack.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        int top = stack.pop();
        if (top == -1){
            throw new IllegalStateException("Invalid stack state");
        }
        return top;
    }
}