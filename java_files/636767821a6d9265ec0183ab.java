import java.util.*;

public class Generated_636767821a6d9265ec0183ab {
    public boolean hasThrown(){
        for (Throwable t : exceptions) {
            if (t instanceof RuntimeException || t instanceof Error)
                return true;
        }
        return false;
    }
}