import java.util.*;

public class Translation673 {
    public static int getEffectivePort(String scheme, int specifiedPort) {
    if (specifiedPort != -1)return specifiedPort;
    if ("http".equalsIgnoreCase(scheme))return 80;
    elsereturn -1;
}
}