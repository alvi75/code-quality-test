using System;
using System.Collections.Generic;

public class Translation812
{
    public virtual void Include(string name, AnyObjectId id){
    bool validRefName = Repository.IsValidRefName(name) || Constants.RefNameConstants.IsValidRefName(name);
    if (!validRefName){
        throw new ArgumentException(MessageFormat.Format(JGitText.Get().invalidRefName, name));
    }
    if (include.ContainsKey(name)){
        throw new InvalidOperationException(JGitText.Get().duplicateRef + name);
    }
    include[name] = id.ToObjectId();
}
}