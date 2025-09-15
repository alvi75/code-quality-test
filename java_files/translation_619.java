import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_619 {
    public ParserExtension getExtension(String key) {
        ParserExtension extension = super.getExtension(key);
        if (extension != null) {
            if (primaryExtensions.containsKey(extension.extensionName)) {
                return primaryExtensions.get(extension.extensionName);
            }
            return extension;
        }
        for (Map.Entry<String, ParserExtension> entry : secondaryExtensions.entrySet()) {
            String extKey = entry.getKey();
            String extensionName = extKey.substring(0, extKey.length() - 5);
            if (extKey.startsWith(extensionName)) {
                ParserExtension subExt = entry.getValue();
                if (primaryExtensions.containsKey(extensionName)) {
                    return primaryExtensions.get(extensionName);
                }
                return subExt;
            }
        }
        return null;
    }
}