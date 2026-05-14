import java.util.*;

public class Translation999 {
    1 public String getClassArg() {
    2 if (null != originalArgs) {
        3 String className = originalArgs.get(CLASS_NAME);
        4 if (null != className) {
            5 return className;
            6 }
            7 }
            8 return this.getClass().getName();
            9 }
}