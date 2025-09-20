using System;
using System.Collections.Generic;

public class Translation634
{
    public static NGit.TagCommand.TagOpt FromString(string str){
    if (str.Length != 0){
        str = str.ToLower();
    }
    foreach (TagOpt opt in _values){
        if (opt.Option.Equals(str, StringComparison.Ordinal)){
            return opt;
        }
    }
    throw new ArgumentException(MessageFormat.Format(JGitText.Get().invalidTagOption, str));
}
}