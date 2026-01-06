import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    /**Pop an abstract type from the output frame stack and return its value.*/
    private int pop(){
        if (outputFrameStack.isEmpty())
            throw new IllegalStateException("pop() called when empty");
        return outputFrameStack.pop();
    }
}