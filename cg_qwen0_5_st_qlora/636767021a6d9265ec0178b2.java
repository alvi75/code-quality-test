import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    private void pop(final String descriptor){
        if(descriptor.length() == 1) {
            switch (descriptor.charAt(0)) {
                case 'i':
                    this.intValue = Integer.parseInt(descriptor.substring(1));
                    break;
                case 'f':
                    this.floatValue = Float.parseFloat(descriptor.substring(1));
                    break;
                case 'd':
                    this.doubleValue = Double.parseDouble(descriptor.substring(1));
                    break;
                case 's':
                    this.stringValue = descriptor.substring(1);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
            }
        } else {
            throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
        }
    }
}