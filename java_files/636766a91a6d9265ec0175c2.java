import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    /**
     * Pop an abstract type from the output frame stack and return its value.
     */
    private int pop() {
        if (outputStack.size() == 0) {
            throw new RuntimeException("pop: empty stack");
        }
        AbstractType t = (AbstractType) outputStack.pop();
        return t.getValue();
    }
}