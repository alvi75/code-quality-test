import java.util.*;

public class Translation165 {
    ublic override TokenStream Create(TokenStream input) {
    return new PortugueseStemFilter(input);
}
}