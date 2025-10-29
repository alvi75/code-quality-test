import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    /**Pop the various value according to the first character of the descriptor.**/
    private void pop(final String descriptor) {
        if (descriptor.charAt(0) == 'a') {
            this.value = new ArrayList<>();
            this.value.add(this.value);
        } else if (descriptor.charAt(0) == 'b') {
            this.value = new ArrayList<>();
            this.value.add(new BigDecimal(descriptor.substring(1)));
        } else if (descriptor.charAt(0) == 'c') {
            this.value = new ArrayList<>();
            this.value.add(new BigInteger(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'd') {
            this.value = new ArrayList<>();
            this.value.add(new Double(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'e') {
            this.value = new ArrayList<>();
            this.value.add(new Float(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'f') {
            this.value = new ArrayList<>();
            this.value.add(new Long(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'g') {
            this.value = new ArrayList<>();
            this.value.add(new Short(descriptor.substring(1));
        }
    }
}