import java.util.*;

public class Translation739 {
    public final SrndQuery primaryQuery() {
    SrndQuery q;
    if (jj_ntk == -1)jj_ntk = jj_ntk_stream();
    switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
        case REGEXP_TOKEN.LPAREN:jj_consume_token(REGEXP_TOKEN.LPAREN);
        q = fieldsQuery();
        jj_consume_token(REGEXP_TOKEN.RPAREN);
        break;
        case REGEXP_TOKEN.OR:case REGEXP_TOKEN.AND:case REGEXP_TOKEN.W:case REGEXP_TOKEN.N:q = prefixOperatorQuery();
        break;
        case REGEXP_TOKEN.TRUNCQUOTED:case REGEXP_TOKEN.QUOTED:case REGEXP_TOKEN.SUFFIXTERM:case REGEXP_TOKEN.TRUNCTERM:case REGEXP_TOKEN.TERM:q = simpleTerm();
        break;
        default:jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
    }
    @ SuppressWarnings("fallthrough")switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
        case REGEXP_TOKEN.LPAREN: jj_consume_token(REGEXP_TOKEN.LPAREN);
        q = fieldsQuery();
        jj_consume_token(REGEXP_TOKEN.RPAREN);
        break;
        case REGEXP_TOKEN.OR: case REGEXP_TOKEN.AND: case REGEXP_TOKEN.W: case REGEXP_TOKEN.N: q = prefixOperatorQuery();
        break;
        case REGEXP_TOKEN.TRUNCQUOTED: case REGEXP_TOKEN.QUOTED: case REGEXP_TOKEN.SUFFIXTERM: case REGEXP_TOKEN.TRUNCTERM: case REGEXP_TOKEN.TERM: q = simpleTerm();
        break;
        default: jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
    }
    optionalWeights(q);
    {
        if (true) return q;
    }
    throw new IllegalStateException("Missing return statement in function");
}
}