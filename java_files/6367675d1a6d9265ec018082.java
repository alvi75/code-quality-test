import java.util.*;

public class Generated_6367675d1a6d9265ec018082 {
    /**Return the edge connecting the previously returned node with the current node.**/
    Edge edgeToNext(){
        if (currentNode == null) return null;
        return edges.get(currentNode).getEdges().get(nextNode);
    }
}