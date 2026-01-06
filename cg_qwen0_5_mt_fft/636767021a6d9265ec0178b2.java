import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    private void pop(final String descriptor){
        if (descriptor.charAt(0) == 'S') {
            this.s = Integer.parseInt(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'M') {
            this.m = Double.parseDouble(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'F') {
            this.f = Double.parseDouble(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'I') {
            this.i = Integer.parseInt(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'L') {
            this.l = Long.parseLong(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'D') {
            this.d = Double.parseDouble(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'B') {
            this.b = Boolean.parseBoolean(descriptor.substring(1));
        }
    }
}