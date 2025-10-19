import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    private void pop(final String descriptor){
        if (descriptor.charAt(0) == 'I') {
            int val = readInteger();
            push(val);
        } else if (descriptor.charAt(0) == 'B') {
            byte val = readByte();
            push(val);
        } else if (descriptor.charAt(0) == 'C') {
            char val = readChar();
            push(val);
        } else if (descriptor.charAt(0) == 'S') {
            short val = readShort();
            push(val);
        } else if (descriptor.charAt(0) == 'F') {
            float val = readFloat();
            push(val);
        } else if (descriptor.charAt(0) == 'J') {
            long val = readLong();
            push(val);
        } else if (descriptor.charAt(0) == 'D') {
            double val = readDouble();
            push(val);
        } else if (descriptor.charAt(0) == '[') {
            int len = readInteger();
            Object[] arr = new Object[len];
            for (int i = 0; i < len; i++) {
                arr[i] = pop();
            }
            push(arr);
        } else if (descriptor.charAt(0) == 'L') {
            // TODO: support inner classes.
            String className = readClassName();
            try {
                Class<?> clazz = classLoader.loadClass(className);
                push(objToRef(clazz, readObject()));
            } catch (ClassNotFoundException e) {
                throw new IllegalArgumentException("Cannot find class " + className, e);
            }
        } else {
            throw new IllegalArgumentException("Invalid descriptor " + descriptor);
        }
    }
}