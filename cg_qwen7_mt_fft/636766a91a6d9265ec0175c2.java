import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    private int pop() {
    if (sp == 0) throw new EmptyStackException();
    final int val = vals[sp - 1];
    vals[sp - 1] = EMPTY;
    sp--;
    return val;
  }
}