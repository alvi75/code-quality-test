import java.util.*;

public class Generated_6367675c1a6d9265ec018058 {
    public static Supplier<String> createStringSupplier(int start) {
    return new Supplier<String>() {
      int i = start;
      @Override
      public String get() {
        return Integer.toString(i++);
      }
    };
  }
}