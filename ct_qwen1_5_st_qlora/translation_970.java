import java.util.*;

public class Translation970 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append( "[SXPI]" );
    for (FieldInfo field : fields) {
        sb.append( "\t" ).append( field.name() ).append( " (" ).append( field.number() ).append( ")" );
    }
    sb.append( "[/SXPI]" );
    return sb.toString();
}
}