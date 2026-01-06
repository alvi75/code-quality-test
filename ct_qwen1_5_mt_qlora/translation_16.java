import java.util.*;

public class Translation16 {
    public final int read( byte[] buffer, int offset, int length ) {
    synchronized ( this ) {
        if ( buffer == null ) {
            throw new NullPointerException( "buffer == null" );
        }
        java . util . Arrays . checkOffsetAndCount( buffer.length, offset, length );
        if ( length == 0 ) {
            return 0 ;
        }
        int copylen = count - pos < length ? count - pos : length ;
        {
            for ( int i = 0 ;
            i < copylen ;
            i ++ ) {
                buffer[ offset + i ] = unchecked( ( byte ) this . buffer [ pos + i ] ) ;
            }
        }
        pos += copylen ;
        return copylen ;
    }
}
}