import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    /**Pop different value of type based on the first character of the given descriptor.*/
    private void pop(final String descriptor) {
        if (descriptor.charAt(0) == 'L') {
            //pop a reference to a class.
            stack.pop();
        } else if (descriptor.charAt(0) == '[') {
            //pop an array of primitives or objects.
            stack.popArray();
        }
    }
}