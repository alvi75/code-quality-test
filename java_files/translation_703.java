import java.util.*;

public class Translation703 {
    ublic RevFilter clone() {
    return new AndRevFilter.Binary(getA().clone(), getB().clone());
}
}