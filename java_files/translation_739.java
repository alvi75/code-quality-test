import java.util.*;

public class Translation739 {
    public SrndQuery primaryQuery() {
    SrndQuery q;
    switch (jj_ntk==-1?jj_ntk():jj_ntk) {
        case LPAREN:jj_consume_token(LPAREN);
        q=fieldsQuery();
        jj_consume_token(RPAREN);
    }
    else if (jj_2_3_0(7)) {
        q=prefixOperatorQuery();
    }
    else if (jj_2_3_1(8)) {
        q=suffixTerm();
    }
    else if (jj_2_3_2(9)) {
        q=term();
    }
    else {
        reportMatchError();
        throw new ParseException();
    }
    optionalWeights(q);
    return q;
}
}