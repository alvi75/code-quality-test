import java.util.*;

public class Translation492 {
    public GraphvizFormatter(ConnectionCosts costs) {
    this.costs = costs;
    this.bestPathMap = new HashMap<>();
    sb.append(FormatHeader());
    sb.append(" init [style=invis]\n");
    sb.append(" init -> 0.0 [label=\"" + BOS_LABEL + "\"]\n");
}
}