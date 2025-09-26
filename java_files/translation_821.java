import java.util.*;

public class Translation821 {
    ublic String toString(){
    StringBuilder buffer = new StringBuilder();
    buffer.append( "[SCENARIOPROTECT]\n" );
    buffer.append( " .protect = " ).append( protect ).append( "\n" );
    buffer.append( "[/SCENARIOPROTECT]\n" );
    return buffer.toString();
}
}