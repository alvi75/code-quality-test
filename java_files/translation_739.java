import java.util.*;

public class Translation739 {
    0246 public SrndQuery primaryQuery() throws ParseException {
    SrndQuery q;
    switch (jj_ntk==-1?jj_ntk():jj_ntk) {
        case LPAREN:jj_consume_token(LPAREN);
        q = fieldsQuery();
        jj_consume_token(RPAREN);
        break;
        case OR:case AND:case W:case N:q = prefixOperatorQuery();
        break;
        case QUOTED:case TRUNCQUOTED:case SUFFIXTERM:case TRUNCTERM:case TERM:q = simpleTerm();
        break;
        default:jj_la1[5] = jj_gen;
        Jj_consume_token(-1);
        throw new ParseException();
    }
    optionalWeights(q);
    if (true)return q;
    throw new RuntimeException("Missing return statement in function");
}
}