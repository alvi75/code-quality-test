import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    private void pop(final String descriptor){
        if (descriptor.charAt(0) == 's') {
            this.value = Integer.parseInt(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'd') {
            this.value = Double.parseDouble(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'f') {
            this.value = Float.parseFloat(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'i') {
            this.value = Integer.parseInt(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'l') {
            this.value = Long.parseLong(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'b') {
            this.value = Boolean.parseBoolean(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'c') {
            this.value = Character.valueOf(descriptor.charAt(1));
        } else if (descriptor.charAt(0) == 'o') {
            this.value = ObjectFactory.createObject(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'n') {
            this.value = null;
        } else {
            throw new IllegalArgumentException("Unknown descriptor: " + descriptor);
        }
    }
}