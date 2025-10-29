import java.util.*;

public class Generated_6367674f1a6d9265ec017e74 {
    /**Convert a value in a vs array to a string**/
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<vs.length; i++){
            if (i>0) sb.append(", ");
            sb.append(vs[i]);
        }
        return sb.toString();
    }
}