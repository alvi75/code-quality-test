import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    private void pop(final String descriptor){
        if(descriptor.charAt(0) == 'D') {
            this.descriptors.removeFirst();
        } else if (descriptor.charAt(0) == 'F') {
            this.fieldNames.removeFirst();
        } else if (descriptor.charAt(0) == 'L') {
            this.classNames.removeFirst();
        }
    }
}