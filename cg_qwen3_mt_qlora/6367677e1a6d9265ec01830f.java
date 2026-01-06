import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    /**Format the buffered string with the pattern converter, and return the result.*/
    public String format(LoggingEvent event){
        if (event == null) {
            throw new NullPointerException("event");
        }
        //if (pattern == null) {
        //    throw new NullPointerException("pattern");
        //}
        if (buffer == null) {
            buffer = new StringBuffer();
        } else {
            buffer.setLength(0);
        }

        int i = 0;
        while (i < pattern.length()) {
            char c = pattern.charAt(i++);
            if (c == '%') {
                if (i >= pattern.length()) {
                    break;
                }
                c = pattern.charAt(i++);
                switch (c) {
                    case 'd':
                        appendDate(event, buffer);
                        break;
                    case 'F':
                        appendThread(event, buffer);
                        break;
                    case 'M':
                        appendMessage(event, buffer);
                        break;
                    case 'l':
                        appendLocationInformation(event, buffer);
                        break;
                    case 'L':
                        appendLineNumber(event, buffer);
                        break;
                    case 'm':
                        appendMessage(event, buffer);
                        break;
                    case 'n':
                        appendNewline(buffer);
                        break;
                    case 'p':
                        appendLevel(event, buffer);
                        break;
                    case 'r':
                        appendRelativeTime(event, buffer);
                        break;
                    case 't':
                        appendThread(event, buffer);
                        break;
                    case 'u':
                        appendMillisOfSecond(event, buffer);
                        break;
                    case 'U':
                        appendMicrosOfMilli(event, buffer);
                        break;
                    case 'x':
                        appendHexThreadId(event, buffer);
                        break;
                    case 'X':
                        appendHexProcessId(event, buffer);
                        break;
                    case 'c':
                        appendClass(event, buffer);
                        break;
                    case 'C':
                        appendClassName(event, buffer);
                        break;
                    case 'f':
                        appendFile(event, buffer);
                        break;
                    case 'F':
                        appendFullyQualifiedClassName(event, buffer);
                        break;
                    case 'l':
                        appendLocationInformation(event, buffer);
                        break;
                    case 'L':
                        appendLineNumber(event, buffer);
                        break;
                    case 'm':
                        appendMethod(event, buffer);
                        break;
                    case 'M':
                        appendMethodName(event, buffer);
                        break;
                    case 'n':
                        appendNewline(buffer);
                        break;
                    case 'p':
                        append
}