import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    /**Pop an abstract type from the output frame stack and return its value.**/
private int pop(){
        if (frameStack.isEmpty()) {
            throw new IllegalStateException("pop() called when no frame is available");
        }
        AbstractType result = frameStack.pop();
        return result.getValue();
    }
}