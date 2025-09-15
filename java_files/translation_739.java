import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_739 {
    public SrndQuery primaryQuery() throws ParseException {
        SrndQuery q;
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
            case LPAREN:jj_consume_token(LPAREN);
            q = fieldsQuery();
            jj_consume_token(RPAREN);
            break;
            case OR:case AND:case W:case N:q = prefixOperatorQuery();
            break;
            case TRUNCQUOTED:case QUOTED:case SUFFIXTERM:case NOSTEM:case TERM:q = simpleTerm();
            break;
            default:jj_la1[6] = jj_gen;
            break label_3;
        }
        q = normalizeQuery(q);
        if (queryList.size() > 0) {
            q = getDistanceQuery(q, queryList, true , oprt);
        }
        else {
            if (oprt == JJ_NONE) {
                q = getDistanceQuery(q, null, true , oprt);
            }
            else {
                q = getOrQuery(q, oprt);
            }
        }
        label_3:{
            if (true) return q;
        }
        throw new Error("Missing return statement in function");
    }
}