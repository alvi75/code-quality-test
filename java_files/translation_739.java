import java.util.*;

public class Translation739 {
    ublic SrndQuery primaryQuery(){
    SrndQuery q;
    switch ((jj_ntk == -1) ? Jj_ntk() : jj_ntk){
        case RegexpToken.LPAREN:Jj_consume_token(RegexpToken.LPAREN);
        q = FieldsQuery();
        Jj_consume_token(RegexpToken.RPAREN);
        break;
        case RegexpToken.OR:case RegexpToken.AND:case RegexpToken.W:case RegexpToken.N:q = PrefixOperatorQuery();
        break;
        case RegexpToken.TRUNCQUOTED:case RegexpToken.QUOTED:case RegexpToken.SUFFIXTERM:case RegexpToken.TRUNCTERM:case RegexpToken.TERM:q = SimpleTerm();
        break;
        default:jj_la1[5] = jj_gen;
        Jj_consume_token(-1);
        throw new ParseException();
    }
    OptionalWeights(q);
    {
        if (true) return q;
    }
    throw new Exception("Missing return statement in function");
}
}