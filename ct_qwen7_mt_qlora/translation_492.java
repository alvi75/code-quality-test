import java.util.*;

public class Translation492 {
    1 public GraphvizFormatter(ConnectionCosts costs) {
    2 this.costs = costs;
    3 bestPathMap = new HashMap<>();
    4 sb.append(formatHeader());
    5 sb.append(" init [style=invis]\n");
    6 sb.append(" init -> 0.0 [label=\"" + BOS_LABEL + "\"]\n");
}
}