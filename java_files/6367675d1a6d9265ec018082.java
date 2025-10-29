import java.util.*;

public class Generated_6367675d1a6d9265ec018082 {
    /**Return the edge connecting the previously returned node with the current node.**/
    Edge edgeToNext(){
        if (next == null) {
            throw new IllegalStateException("No next node");
        }
        return next.edge;
    }
}