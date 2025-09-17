import java.util.*;

public class Translationtranslation_274 {
    public BufferedReader(Reader in, int size) {
        super(in);
        if (size <= 0) {
            throw new IllegalArgumentException("size <= 0");
        }
        this.in = in;
        this.buf = new char[size];
    }
}