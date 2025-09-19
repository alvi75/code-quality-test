import java.util.*;

public class Translation775 {
    public void seekExact(BytesRef target, TermState otherState) {
    assert otherState != null && otherState instanceof BlockTermState;
    assert !doOrd || ((BlockTermState) otherState).ord < numTerms;
    state.copyFrom(otherState);
    seekPending = true;
    indexIsCurrent = false;
    term.copyBytes(target);
}
}