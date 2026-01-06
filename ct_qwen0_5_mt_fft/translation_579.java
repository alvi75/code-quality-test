import java.util.*;

public class Translation579 {
    public boolean handles(String commandLine) {
    return command.length() + 1 < commandLine.length() && commandLine.charAt(commandLine.length() - 1) == ' ' && commandLine.startsWith(command);
}
}