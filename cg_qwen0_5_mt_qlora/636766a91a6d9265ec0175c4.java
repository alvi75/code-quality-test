import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    /**Pop different value of type based on the first character of the given descriptor.**/
    private void pop(final String descriptor) {
        if (descriptor.length() == 1) {
            return;
        }
        final char c = descriptor.charAt(0);
        switch (c) {
            case 'a':
                this.a = true;
                break;
            case 'b':
                this.b = true;
                break;
            case 'c':
                this.c = true;
                break;
            case 'd':
                this.d = true;
                break;
            case 'e':
                this.e = true;
                break;
            case 'f':
                this.f = true;
                break;
            case 'g':
                this.g = true;
                break;
            case 'h':
                this.h = true;
                break;
            case 'i':
                this.i = true;
                break;
            case 'j':
                this.j = true;
                break;
            case 'k':
                this.k = true;
                break;
            case 'l':
                this.l = true;
                break;
            case 'm':
                this.m = true;
                break;
            case 'n':
                this.n = true;
                break;
            case 'o':
                this.o = true;
                break;
            case 'p':
                this.p = true;
                break;
            case 'q':
                this.q = true;
                break;
            case 'r':
                this.r = true;
                break;
            case 's':
                this.s = true;
                break;
            case 't':
                this.t = true;
                break;
            case 'u':
                this.u = true;
                break;
            case 'v':
                this.v = true;
                break;
            case 'w':
                this.w = true;
                break;
            case 'x':
                this.x = true;
                break;
            case 'y':
                this.y = true;
                break;
            case 'z':
                this.z = true;
                break;
            default:
                throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
        }
    }
}