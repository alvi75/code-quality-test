import java.util.*;

public class Translation739 {
    final public SrndQuery PrimaryQuery() {
    SrndQuery q;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LPAREN:jj_consume_token(LPAREN);
        q = FieldsQuery();
        jj_consume_token(RPAREN);
        break;
        case OR:case AND:case W:case N:q = PrefixOperatorQuery();
        break;
        case QUOTED:case TRUNCQUOTED:case SUFFIXTERM:case TRUNCTERM:case TERM:q = SimpleTerm();
        break;
        default:jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
    }
    OptionalWeights(q);
    {
        if (true) return q;
    }
    throw new Error("Missing return statement in function");
}
}