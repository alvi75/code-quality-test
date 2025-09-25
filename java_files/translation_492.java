import java.util.*;

public class Translation492 {
    public GraphvizFormatter(ConnectionGraph connectionGraph) {
    this.connectionGraph = connectionGraph;
    this.bestPathMap = new HashMap<>();
    sb = new StringBuilder();
    sb.append(formatHeader());
    sb.append(" init [style=invis]\n");
    sb.append(" init -> 0.0 [label=\"").append(BOS_LABEL).append("\"]\n");
}
}