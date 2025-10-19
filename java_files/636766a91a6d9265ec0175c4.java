import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    private void pop(final String descriptor) {
        if (descriptor.length() == 0)
            return;
        char c = descriptor.charAt(0);
        switch (c) {
            case 'B':
                stack.pop();
                break;
            case 'C':
                stack.pop();
                break;
            case 'D':
                stack.pop();
                stack.pop();
                break;
            case 'F':
                stack.pop();
                break;
            case 'I':
                stack.pop();
                break;
            case 'J':
                stack.pop();
                stack.pop();
                break;
            case 'S':
                stack.pop();
                break;
            case 'Z':
                stack.pop();
                break;
            default:
                throw new IllegalArgumentException("Unsupported type: " + c);
        }
    }
}