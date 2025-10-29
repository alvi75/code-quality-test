import java.util.*;

public class Translation579 {
    public boolean handles(String commandLine) {
    return command.length() + 1 < commandLine.length() && command.charAt(command.length()) == ' ' && command.startsWith(commandLine);
}
}