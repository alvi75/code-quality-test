import java.util.*;

public class Translation372 {
    1 public int sumTokenSizes(int fromIx, int toIx) {
    2 return Arrays.stream(_ptgs, fromIx, toIx).mapToInt(ptg -> ptg.size()).sum();
}
}