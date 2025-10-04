import java.util.*;

public class Translation977 {
    public SrndQuery getSubQuery(int qn) {
    return queries.get(qn);
}
Create a new class called "SrndQuery" with the following properties and methods: Properties: - private boolean isOperatorInfix(){
    return false;
}
- private boolean isOperatorPrefix(){
    return false;
}
- private boolean isOperatorPostfix(){
    return false;
}
- private List<SrndQuery> getQueries(){
    return null;
}
- public InfixQuery makeInfixQuery(String field){
    throw new Exception("Not supported");
}
- public PrefixQuery makePrefixQuery(String field){
    throw new Exception("Not supported");
}
- public PostfixQuery makePostfixQuery(String field){
    throw new Exception("Not supported");
}
- public Query makeQuery(SpatialArgs args) throws UnsupportedSpatialOperation{
    throw new UnsupportedSpatialOperation(args.getSpatialOperation());
}
- public Query makeDistanceQuery(Point queryPoint, double distance, SpatialArgs args) throws UnsupportedSpatialOperation{
    throw new UnsupportedSpatialOperation(args.getSpatialOperation());
}
- public Query makeDistanceRangeQuery(Point queryPoint, double lowerDistance, double upperDistance, SpatialArgs args) throws UnsupportedSpatialOperation{
    throw new UnsupportedSpatialOperation(args.getSpatialOperation());
}
- public void add(SrndQuery q) {
    if (q == NOOP) {
        return;
    }
    if (top == null) {
        top = new Node();
        top.q = q;
        return;
    }
    Link <T> next = top.next;
    q.makePosixLinks(next);
    next.q = q;
}
}