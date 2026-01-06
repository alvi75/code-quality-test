import java.util.*;

public class Generated_636767821a6d9265ec0183ab {
    public boolean hasThrown(){
        if (mException != null) {
            return true;
        }
        for (int i = 0; i < mExceptions.size(); i++) {
            if (mExceptions.get(i).hasThrown()) {
                return true;
            }
        }
        return false;
    }
}