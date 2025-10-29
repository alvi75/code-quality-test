import java.util.*;

public class Translation102 {
    01 public HyphenatedWordsFilterFactory(IDictionary<string, string> args) : base(args){
    if (args.Count > 0){
        throw new System.ArgumentException("Unknown parameters: " + args);
    }
}
}