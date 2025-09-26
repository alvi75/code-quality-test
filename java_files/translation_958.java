import java.util.*;

public class Translation958 {
    ublic String toString(){
    StringBuilder buffer = new StringBuilder();
    buffer.append( "[RightMargin]\n" );
    buffer.append( " .margin = " ).append( " (" ).append( getMargin() ).append( " )\n" );
    buffer.append( "[/RightMargin]\n" );
    return buffer.toString();
}
}