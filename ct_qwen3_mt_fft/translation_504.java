import java.util.*;

public class Translation504 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append( "[FtCbls ]" );
    buffer.append( "\n" );
    buffer.append( " size = " ).append( getDataSize() ).append( "\n" );
    buffer.append( " reserved= " ).append( HexDump.toHex( getReserved() ) ).append( "\n" );
    buffer.append( "[/FtCbls ]" );
    buffer.append( "\n" );
    return buffer.toString();
}
}