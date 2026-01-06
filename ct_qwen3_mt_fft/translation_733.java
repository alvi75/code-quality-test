import java.util.*;

public class Translation733 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append( "[CHART]\n" );
    buffer.append( " .x = " ).append( "0x" ).append( HexDump.toHex( getX() ) ).append( " (" ).append( getX()).append( " )\n" );
    buffer.append( " .y = " ).append( "0x" ).append( HexDump.toHex( getY() ) ).append( " (" ).append( getY()).append( " )\n" );
    buffer.append( " .width = " ).append( "0x" ).append( HexDump.toHex( getWidth() ) ).append( " (" ).append( getWidth()).append( " )\n" );
    buffer.append( " .height = " ).append( "0x" ).append( HexDump.toHex( getHeight() ) ).append( " (" ).append( getHeight()).append( " )\n" );
    buffer.append( "[/CHART]\n" );
    return buffer.toString();
}
}