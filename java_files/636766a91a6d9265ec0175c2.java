import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    private int pop(){
        if (outputStack.isEmpty()) {
            throw new IllegalStateException("Output stack is empty.");
        }
        int val = outputStack.pop();
        if (val == -1) {
            // If we encounter a null, then we need to make sure that it's not the end of a string.
            if (!outputStack.isEmpty() && outputStack.peek() != -2) {
                // We know this is a real null, so just return it.
                return val;
            } else {
                // This is actually the end of the string, so we should return -2.
                return -2;
            }
        }
        return val;
    }
}