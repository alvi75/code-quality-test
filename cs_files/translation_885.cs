using System;
using System.Collections.Generic;

public class Translation885
{
    public virtual RevCommit TryFastForward(RevCommit newCommit){
    if (newCommit == null){
        throw new ArgumentNullException("newCommit");
    }
    if (newCommit.IsComplete){
        throw new ArgumentException(JGitText.Get().alreadyCompleteCommit);
    }
    RefCounted<RevCommit> @ref = refCount.GetAndIncrement();
    try{
        AddCommand(command);
        if (@ref.IsValueCreated && @ref.Value != null){
            return @ref.Value;
        }
        else{
            ClearCommand();
            return null;
        }
    }
    catch (IOException ioe){
        ClearCommand();
        throw;
    }
}
}