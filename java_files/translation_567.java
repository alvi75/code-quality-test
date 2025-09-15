import java.util.*;

public class Translationtranslation_567 {
    public static boolean isValidSchemeChar(int index, char c) {
        if ((c >= 'a' && c <= 'z')|| (c >= 'A' && c <= 'Z')|| (c >= '0' && c <= '9')|| c == '+' || c == '-' || c == '.' || c == ':' || c == '^' || c == '[' || c == ']' || c == '\"'|| c == '{
            ' && c == '}
            ' || c == '~' || c == '*' || c == '?'|| c == '|' || c == '&' || c == '/'){
                return true;
            }
            return false;
        }
}