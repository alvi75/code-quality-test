import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    /**Pop an abstract type from the output frame stack and return its value.**/
    private int pop(){
        if (outputFrameStack.size() == 0)
            throw new RuntimeException("pop() called with empty output frame stack");
        AbstractType t = outputFrameStack.pop();
        if (t instanceof IntType){
            return ((IntType)t).value;
        } else {
            throw new RuntimeException("pop() called with non-int type: " + t);
        }
    }
}