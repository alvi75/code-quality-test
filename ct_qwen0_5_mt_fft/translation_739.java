import java.util.*;

public class Translation739 {
    public SrndQuery primaryQuery() throws ParseException {
    SrndQuery q;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LPAR:jj_consume_token(LPAR);
        q = fieldsQuery();
        jj_consume_token(RPAREN);
        break;
        case OR:case AND:case W:case N:q = prefixOperatorQuery();
        break;
        case TRUNCQUOTED:case QUOTED:case SUFFIXTERM:case TRUNCTERM:case TERM:q = simpleTerm();
        break;
        default:jj_la1[5] = jj_gen;
        break label_20;
    }
    {
        if (true) return q;
    }
    throw new Error("Missing return statement in function");
}
}