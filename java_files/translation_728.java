import java.util.*;

public class Translation728 {
    0;
int i = 0;
while (i < args.Count) {
    string key = args.Keys[i];
    if (!key.StartsWith("lang")) {
        throw new System.ArgumentException("Unknown parameter: " + key);
    }
    string lang = args[key];
    if (lang.Equals("auto", StringComparison.Ordinal)) {
        languageSet = null;
    }
    else if (languageSet == null) {
        languageSet = new HashSet<string>();
    }
    languageSet.Add(lang);
    ++i;
}
if (languageSet != null && languageSet.Count == 1 && languageSet.Contains("auto")) {
    languageSet = null;
}
}
}