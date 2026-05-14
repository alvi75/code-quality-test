import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    /**Pop different value of type based on the first character of the given descriptor.**/
    private void pop(final String descriptor) {
        switch (descriptor.charAt(0)) {
            case 'L':
                this.popObject();
                break;
            case '[':
                this.popArray(descriptor);
                break;
            default:
                this.popPrimitive(descriptor);
                break;
        }
    }
}