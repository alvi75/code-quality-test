import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    /**Formats LoggingEvent as a fixed-format string**/
    final StringBuilder result = new StringBuilder(1024);
    if (event.getLevel() == Level.OFF) {
      result.append("OFF");
    } else if (event.getLevel() == Level.FATAL) {
      result.append("FATAL");
    } else if (event.getLevel() == Level.ERROR) {
      result.append("ERROR");
    } else if (event.getLevel() == Level.WARN) {
      result.append("WARN");
    } else if (event.getLevel() == Level.INFO) {
      result.append("INFO");
    } else if (event.getLevel() == Level.DEBUG) {
      result.append("DEBUG");
    } else if (event.getLevel() == Level.TRACE) {
      result.append("TRACE");
    }
    result.append(": ");
    result.append(event.getMessage().getFormattedMessage());
    return result.toString();
  }
}