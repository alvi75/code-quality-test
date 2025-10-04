import java.util.*;

public class Translation728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    nameType = requireInt(args, "nameType");
    ruleType = requireInt(args, "ruleType");
    int flags = 0;
    if (!args.isEmpty()) {
        flags = flags | 0x01;
        for (Map.Entry<String,String> entry : args.entrySet()) {
            flags = flags | 0x08;
        }
    }
    this.flags = flags;
}
}