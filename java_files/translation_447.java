import java.util.*;

public class Translation447 {
    public String getErrorHeader(RecognitionException e) {
    int line = e.getLineNumber();
    int column = e.getColumn();
    String message = e.getMessage();
    StringBuilder sb = new StringBuilder(message.length() + 50);
    sb.append("line ").append(line).append(":").append(column);
    if ( message != null ) {
        sb.append(": ");
        sb.append(message);
    }
    return sb.toString();
}
}