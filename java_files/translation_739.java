import java.util.*;

public class Translation739 {
    public SrndQuery primaryQuery() {
    switch ( (jj_ntk==-1)?jj_ntk():jj_ntk) {
        case RegexpToken.LPAREN:jj_consume_token(RegexpToken.LPAREN);
        SrndQuery q=FieldsQuery();
        jj_consume_token(RegexpToken.RPAREN);
        break;
        case RegexpToken.OR:case RegexpToken.AND:case RegexpToken.W:case RegexpToken.N:q=PrefixOperatorQuery();
        break;
        case RegexpToken.TRUNCQUOTED:case RegexpToken.QUOTED:case RegexpToken.SUFFIXTERM:case RegexpToken.TRUNCTERM:case RegexpToken.TERM:q=SimpleTerm();
        break;
        default:jj_la1[5]=jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
    }
    OptionalWeights(q);
    return q;
}
}