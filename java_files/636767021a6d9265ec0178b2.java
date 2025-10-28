import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    private void pop(final String descriptor) {
        if (descriptor.charAt(0) == 'L') { // class type
            final int index = descriptor.indexOf(';', 1);
            if (index != -1)
                stack.push(descriptor.substring(1, index));
        } else if (descriptor.charAt(0) == '[') { // array type
            final int index = descriptor.indexOf(';', 1);
            if (index != -1)
                stack.push(descriptor.substring(1, index));
        } else if (descriptor.charAt(0) == 'Z' || descriptor.charAt(0) == 'C'
                || descriptor.charAt(0) == 'B' || descriptor.charAt(0) == 'S'
                || descriptor.charAt(0) == 'I' || descriptor.charAt(0) == 'F'
                || descriptor.charAt(0) == 'D' || descriptor.charAt(0) == 'J')
            stack.push(descriptor);
    }
}