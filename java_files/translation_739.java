import java.util.*;

public class Translation739 {
    final public SrndQuery PrimaryQuery() throws ParseException {
    SrndQuery q;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LPAREN:jj_consume_token(LPAREN);
        q = FieldsQuery();
        jj_consume_token(RPAREN);
        break;
        case OR:case AND:case W:case N:q = PrefixOperatorQuery();
        break;
        case TRUNCQUOTED:case QUOTED:case SUFFIXTERM:case NOSTEM:case TERTIF:case TERM:q = SimpleTerm();
        break;
        default:jj_la1[6] = jj_gen;
        break label_3;
    }
    q = normalizeQuery(q);
    if (true) return q;
}
}