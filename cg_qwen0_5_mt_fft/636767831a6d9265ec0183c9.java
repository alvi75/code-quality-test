import java.util.*;

public class Generated_636767831a6d9265ec0183c9 {
    public static String peek() {
        if (stack.isEmpty()) return null;
        StackTraceElement[] stack = new StackTraceElement[stack.size()];
        stack = stack.toArray(new StackTraceElement[0]);
        return stack[stack.length - 1].getClassName();
    }
}