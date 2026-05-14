import java.util.*;

public class Translation579 {
    2 public boolean handles(String commandLine) {
    3 return command.length() + 1 <= commandLine.length()4 && commandLine.charAt(command.length()) == ' '5 && commandLine.startsWith(command);
}
}