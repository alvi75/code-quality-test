import java.util.*;

public class Translation520 {
    1 public static int numNonnull(Object[] data) {
    2 return (int) Arrays.stream(data).filter(Objects::nonNull).count();
}
}