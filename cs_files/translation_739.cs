using System;
using System.Collections.Generic;

public class Translation739
{
    public SrndQuery PrimaryQuery(){
    SrndQuery q;
    switch ((jj_ntk == -1) ? Jj_ntk() : jj_ntk){
        case RegexpToken.LPAREN:Jj_consume_token(RegexpToken.LPAREN);
        q = FieldsQuery();
        Jj_consume_token(RegexpToken.RPAREN);
        break;
        case RegexpToken.OR:case RegexpToken.AND:case RegexpToken.W:case RegexpToken.N:q = PrefixOperatorQuery();
        break;
        case RegexpToken.TERM:case RegexpToken.REGEXPTERM:case RegexpToken.RANGEIN_START:case RegexpToken.RANGEEX_START:case RegexpToken.NUMBER:;
        break;
        default:jj_la1[6] = jj_gen;
        Jj_consume_token(-1);
        throw new ParseException();
    }
    OptimizeQuery(q);
    return q;
}
}