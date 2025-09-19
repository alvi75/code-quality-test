import java.util.*;

public class Translation728 {
    public BeiderMorseFilterFactory(Map<String,String> args, LanguageDetector language, PhoneticEngine engine) {
    super(args);
    this.engine = engine;
    this.languages = getSet(args, "languageSet");
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}