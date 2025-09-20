using System;
using System.Collections.Generic;

public class Translation728
{
    public BeiderMorseFilterFactory(IDictionary<string, string> args): base(args){
    nameType = Enum.Parse(typeof(NameType), Get(args, "nameType", NameType.Generic.ToString()));
    ruleType = Enum.Parse(typeof(RuleType), Get(args, "ruleType", RuleType.Abbreviated.ToString()));
    if (args.Count > 0){
        throw new System.ArgumentException("Unknown parameters: " + args);
    }
}
}