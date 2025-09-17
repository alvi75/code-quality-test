import java.util.*;

public class Translationtranslation_739 {
    final public SrndQuery PrimaryQuery() throws ParseException {
        SrndQuery q;
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
            case LPAREN:jj_consume_token(LPAREN);
            q = FieldsQuery();
            jj_consume_token(RPAREN);
            break;
            case OR:case AND:case W:case N:q = PrefixOperatorQuery();
            break;
            case QUOTED:case TERM:case REGEXPTERM:case RANGEIN_START:case RANGEEX_START:q = SimpleTerm();
            break;
            case RANGEIN_END:case RANGEEX_END:q = OptionalWeights(new RangeQuery(getSimpleValue(q), true , false ));
            break;
            default:jj_la1[5] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
        }
        if (true) return q;
    }
    throw new Error("Missing return statement in function");
    }
}