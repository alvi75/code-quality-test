import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    public String format(LoggingEvent event){
        if (event == null) {
            throw new NullPointerException("event");
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int j = 0; j < this.pattern.length(); j++) {
            char c = this.pattern.charAt(j);
            if (c == '%') {
                if (i >= event.getPatternLayout().getPattern().length()) {
                    break;
                }
                String s = this.pattern.substring(i + 1, j);
                if (s.equals("%d")) {
                    sb.append(event.getLevel());
                } else if (s.equals("%t")) {
                    sb.append(event.getThreadName());
                } else if (s.equals("%p")) {
                    sb.append(event.getLoggerName());
                } else if (s.equals("%m")) {
                    sb.append(event.getMessage());
                } else if (s.equals("%n")) {
                    sb.append("\n");
                } else if (s.equals("%l")) {
                    sb.append(event.getMillis());
                } else if (s.equals("%x")) {
                    sb.append(event.getThrowableAsString());
                } else if (s.equals("%X")) {
                    sb.append(event.getThrowable().toString());
                } else if (s.equals("%F")) {
                    sb.append(event.getThrowable().getClass().getName());
                } else if (s.equals("%T")) {
                    sb.append(event.getThrowable().getStackTrace()[0].toString());
                } else if (s.equals("%C")) {
                    sb.append(event.getThrowable().getStackTrace()[1].toString());
                } else if (s.equals("%S")) {
                    sb.append(event.getThrowable().getStackTrace()[2].toString());
                } else if (s.equals("%A")) {
                    sb.append(event.getThrowable().getStackTrace()[3].toString());
                } else if (s.equals("%E")) {
                    sb.append(event.getThrowable().getStackTrace()[4].toString());
                } else if (s.equals("%G")) {
                    sb.append(event.getThrowable().getStackTrace()[5].toString());
                } else if (s.equals("%H")) {
                    sb.append(event.getThrowable().getStackTrace()[6].toString());
                } else if (s.equals("%I")) {
                    sb.append(event.getThrowable().getStackTrace()[7].toString());
                } else if (s.equals("%O")) {
                    sb.append(event.getThrowable().getStackTrace()[8].toString());
                } else if (s.equals("%P")) {
}