import java.util.*;

public class Translation236 {
    1 public Ref peel(Ref ref) {
    2 try {
        3 return getRefDatabase().peel(ref);
        4 }
        catch (IOException e) {
            5 return ref;
            6 }
        }
}