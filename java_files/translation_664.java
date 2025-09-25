import java.util.*;

public class Translation664 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append( "[SXVDEX]\n" );
    buffer.append( " .grbit1 = " ).append( Integer.toHexString( getGrbit1() ) ).append( "\n" );
    buffer.append( " .grbit2 = " ).append( Integer.toHexString( getGrbit2() ) ).append( "\n" );
    buffer.append( " .citmShow = " ).append( Integer.toHexString( getCitmShow() ) ).append( "\n" );
    buffer.append( " .isxdiSort = " ).append( Integer.toHexString( getIsxdiSort() ) ).append( "\n" );
    buffer.append( " .isxdiShow = " ).append( Integer.toHexString( getIsxdiShow() ) ).append( "\n" );
    buffer.append( " .subName = " ).append( getSubName()).append( "\n" );
    buffer.append( "[/SXVDEX]\n" );
    return buffer.toString();
}
}