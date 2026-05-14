import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    private void pop(final String descriptor) {
        char car = descriptor.charAt(0);
        if (car == 'V') {
            stack.removeLast();
        } else if (car == '[' || car == 'L') {
            int count = 1;
            for (int i = 1; i < descriptor.length(); ++i) {
                if (descriptor.charAt(i) == '[') {
                    ++count;
                } else if (descriptor.charAt(i) == ']') {
                    --count;
                    if (count == 0) {
                        break;
                    }
                }
            }
            List<?> array = stack.removeLast();
            while (--count >= 0) {
                array = ((List<?>) array).remove(array.size() - 1);
            }
            stack.addLast(array);
        } else {
            // primitive or field types, just remove one element from top.
            stack.removeLast();
        }
    }
}