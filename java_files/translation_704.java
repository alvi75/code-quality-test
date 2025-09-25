import java.util.*;

public class Translation704 {
    1 public Reader create(Reader input) {
    return new PersianCharFilter(input);
}
}