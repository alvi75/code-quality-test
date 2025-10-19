import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    private int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("pop called but no items in stack");
        }
        int result = stack.pop();
        if (result == -1) {
            throw new IllegalStateException("pop called with negative item");
        }
        return result;
    }
}