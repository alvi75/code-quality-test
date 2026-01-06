import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    /**Pop the various value according to the first character of the descriptor.**/
    private void pop(final String descriptor) {
        if (descriptor.length() == 1) {
            switch (descriptor.charAt(0)) {
                case 'a':
                    this.value = new ArrayList<>();
                    break;
                case 'b':
                    this.value = new ArrayList<>();
                    break;
                case 'c':
                    this.value = new ArrayList<>();
                    break;
                case 'd':
                    this.value = new ArrayList<>();
                    break;
                case 'e':
                    this.value = new ArrayList<>();
                    break;
                case 'f':
                    this.value = new ArrayList<>();
                    break;
                case 'g':
                    this.value = new ArrayList<>();
                    break;
                case 'h':
                    this.value = new ArrayList<>();
                    break;
                case 'i':
                    this.value = new ArrayList<>();
                    break;
                case 'j':
                    this.value = new ArrayList<>();
                    break;
                case 'k':
                    this.value = new ArrayList<>();
                    break;
                case 'l':
                    this.value = new ArrayList<>();
                    break;
                case 'm':
                    this.value = new ArrayList<>();
                    break;
                case 'n':
                    this.value = new ArrayList<>();
                    break;
                case 'o':
                    this.value = new ArrayList<>();
                    break;
                case 'p':
                    this.value = new ArrayList<>();
                    break;
                case 'q':
                    this.value = new ArrayList<>();
                    break;
                case 'r':
                    this.value = new ArrayList<>();
                    break;
                case 's':
                    this.value = new ArrayList<>();
                    break;
                case 't':
                    this.value = new ArrayList<>();
                    break;
                case 'u':
                    this.value = new ArrayList<>();
                    break;
                case 'v':
                    this.value = new ArrayList<>();
                    break;
                case 'w':
                    this.value = new ArrayList<>();
                    break;
                case 'x':
                    this.value = new ArrayList<>();
                    break;
                case 'y':
                    this.value = new ArrayList<>();
                    break;
                case 'z':
                    this.value = new ArrayList<>();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
            }
        } else {
            throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
        }
    }
}