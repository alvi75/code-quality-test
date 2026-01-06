import java.util.*;

public class Generated_636767821a6d9265ec0183ab {
    /**
 * Check whether there is a thrown.
 */
public boolean hasThrown() {
        if (this.thrown == null) {
            return false;
        }
        for (int i = 0; i < this.thrown.size(); i++) {
            if (!this.thrown.get(i).isAlive()) {
                return true;
            }
        }
        return false;
    }
}