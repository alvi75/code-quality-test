import java.util.*;

public class Translation189 {
    public final int normalize( char[] s , int len ) {
    for ( int i = 0 ;
    i < len ;
    i ++ ) {
        switch ( s [ i ] ) {
            case 'ً' : case 'ئ' : s [ i ] = 'ء' ;
            break ;
            case 'ه' : if ( s [ i - 1 ] == 'ي' || s [ i + 1 ] == 'ي' ) {
                s [ i ] = 'ح' ;
            }
            else {
                s [ i ] = 'ه' ;
            }
            break ;
            case 'ة' : s [ i ] = 'ه' ;
            break ;
            default : break ;
        }
    }
    return len ;
}
}