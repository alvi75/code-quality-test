import java.util.*;

public class Translation841 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append( "[Array Formula or Shared Formula]\n" );
    buffer.append( "row = " ).append( getRow() ).append( "\n" );
    buffer.append( "col = " ).append( getColumn()).append( "\n" );
    buffer.append( "[/Array Formula or Shared Formula]\n" );
    return buffer.toString();
}
}