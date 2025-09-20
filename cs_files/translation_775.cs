using System;
using System.Collections.Generic;

public class Translation775
{
    public override void SeekExact(BytesRef target, TermState otherState){
    Debug.Assert(otherState != null && otherState is BlockTermState);
    Debug.Assert(!doOrd || ((BlockTermState)otherState).Ord < outerInstance.numTerms);
    state.CopyFrom(otherState);
    seekPending = true;
    indexIsCurrent = false;
    term.CopyBytes(target);
}
}