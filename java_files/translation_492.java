import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_492 {
    public GraphvizFormatter(ConnectionCosts costs) {
        this.costs = costs;
        this.bestPathMap = new HashMap<>();
        sb.append( formatHeader() );
        sb.append(" init [style=invis]\n");
        sb.append(" init -> 0.0 [label=\"").append(BOS_LABEL).append("\"]\n");
    }
}