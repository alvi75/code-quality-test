import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    private void pop(final String descriptor) {
        char c = descriptor.charAt(0);
        if (c == 'V') {
            stack.removeLast();
        } else if (c == '[' || c == 'L') {
            int endCount = 1;
            for (int i = 1; i < descriptor.length(); ++i) {
                switch (descriptor.charAt(i)) {
                    case '[':
                        ++endCount;
                        break;
                    case ']':
                        --endCount;
                        if (endCount == 0) {
                            break;
                        }
                        break;
                }
            }
            while (endCount > 0) {
                stack.removeLast();
                --endCount;
            }
        }
    }
}