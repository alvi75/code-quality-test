import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    /**Pop the various value according to the first character of the descriptor.*/
    private void pop(final String descriptor) {
        if (descriptor.charAt(0) == 'L') { //Class
            final int index = descriptor.indexOf(';', 1);
            if (index != -1) {
                this.type = descriptor.substring(1, index).replace('/', '.');
            } else {
                this.type = descriptor.substring(1);
            }
        } else if (descriptor.charAt(0) == '[') { //Array
            this.type = "java.lang.Object";
            final int index = descriptor.indexOf('[', 1);
            if (index != -1) {
                for (int i = 1; i < index; i++) {
                    this.type += "[]";
                }
            }
        } else if (descriptor.charAt(0) == 'Z' || descriptor.charAt(0) == 'B'
                || descriptor.charAt(0) == 'C' || descriptor.charAt(0) == 'S'
                || descriptor.charAt(0) == 'I' || descriptor.charAt(0) == 'F'
                || descriptor.charAt(0) == 'D' || descriptor.charAt(0) == 'J') { //Primitive
            this.type = descriptor;
        } else if (descriptor.charAt(0) == 'V') { //Void
            this.type = "void";
        } else {
            throw new IllegalArgumentException("Unknown type: " + descriptor);
        }
    }
}