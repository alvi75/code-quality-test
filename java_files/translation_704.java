import java.util.*;

public class Translation704 {
    public TextReader create(Reader input) {
    return new PersianCharFilter(input);
}
}