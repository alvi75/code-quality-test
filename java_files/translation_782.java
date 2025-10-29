import java.util.*;

public class Translation782 {
    0;
int i = 0;
while (i < _states.Count){
    ATNState state = _states[i];
    if (state == s){
        break;
    }
    i++;
}
if (i >= _states.Count){
    throw new ArgumentException("Invalid ATN state.");
}
return Look(state, ctx);
}
}