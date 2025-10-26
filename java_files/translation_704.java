import java.util.*;

public class Translation704 {
    ublic TextReader create(TextReader input) {
    return new PersianCharFilter(input);
}
}