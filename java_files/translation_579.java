import java.util.*;

public class Translation579 {
    ublic boolean handles(String commandLine) {
    int pos = 0;
    for (int i = 0;
    i < command.length();
    i++) {
        char cmdChar = command.charAt(i);
        char ch = commandLine.charAt(pos);
        if (cmdChar != ch) {
            return false;
        }
        pos++;
    }
    return true;
}
}