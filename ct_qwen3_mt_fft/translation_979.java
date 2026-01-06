import java.util.*;

public class Translation979 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append( "[BLANK]\n" );
    buffer.append( " .row = " ).append( "0x" ).append( Integer.toHexString( getRow() ) ).append( ' ' );
    buffer.append( " (" ).append( getRow() ).append( " )\n" );
    buffer.append( " .col = " ).append( "0x").append( Integer.toHexString( getColumn() ) ).append( ' ' );
    buffer.append( " (" ).append( getColumn() ).append( " )\n" );
    buffer.append( " .xf = " ).append( "0x" ).append( Integer.toHexString( getXFIndex() ) ).append( ' ' );
    buffer.append( " (" ).append( getXFIndex() ).append( " )\n" );
    buffer.append( "[/BLANK]\n" );
    return buffer.toString();
}
}