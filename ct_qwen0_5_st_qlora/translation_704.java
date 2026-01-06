import java.util.*;

public class Translation704 {
    public TextReader create(TextReader input) {
    return new PersianCharFilter(input);
}
}