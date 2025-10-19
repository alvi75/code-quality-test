import java.util.*;

public class Generated_636767821a6d9265ec0183ab {
    public boolean hasThrown(){
        for (final Throwable t : this.throwables) {
            if(t instanceof RuntimeException){
                return true;
            }
        }
        return false;
    }
}