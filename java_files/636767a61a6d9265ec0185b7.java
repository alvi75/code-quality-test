import java.util.*;

public class Generated_636767a61a6d9265ec0185b7 {
    private static int digitValue(final char c){
    if(c >= '0' && c <= '9') return c - '0';
    else if (c == '.') return 10;
    else throw new IllegalArgumentException("Invalid character: " + c);
  }
}