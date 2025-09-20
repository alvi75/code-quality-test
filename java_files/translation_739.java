import java.util.*;

public class Translation739 {
    public SrndQuery primaryQuery() {
    SrndQuery q;
    switch (jj_ntk) {
        case RegexpToken.LPAREN:jj_consume_token(RegexpToken.LPAREN);
        q = fieldsQuery();
        jj_consume_token(RegexpToken.RPAREN);
        break;
        case RegexpToken.OR:case RegexpToken.AND:case RegexpToken.W:case RegexpToken.N:q = prefixOperatorQuery();
        break;
        case RegexpToken.TRUNCQUOTED:case RegexpToken.QUOTED:case RegexpToken.SUFFIXTERM:case RegexpToken.TRUNCTERM:case RegexpToken.TERM:q = simpleTerm();
        break;
        default:jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
    }
    optionalWeights(q);
    {
        if (true) return q;
    }
    throw new Error("Missing return statement in function");
}
}