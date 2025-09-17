import java.util.*;

public class Translationtranslation_752 {
    public Token LT(int k) {
        lazyInit();
        if ( k == 0 ) return null;
        if ( k < 0 ) return LB(-k);
        int i = p + k - 1;
        while ( i >= 0 ) {
            if ( tokens.get(i).getType() == Token.EOF ) return tokens.get(i);
            i--;
        }
        i = p + k;
        while ( i < tokens.size() && tokens.get(i).getType() == Token.EOF ) i++;
        if ( i < tokens.size() ) return tokens.get(i);
        else return tokens.get(tokens.size()-1);
    }
}