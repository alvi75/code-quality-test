import java.util.*;

public class Translation646 {
    0;
int i = 0;
while (i < errorRecoveryTokens.Count){
    Token t = errorRecoveryTokens[i];
    if (t.Type == TokenConstants.EOF){
        break;
    }
    if (followSet.Contains(t.Type)){
        break;
    }
    i++;
}
if (i >= errorRecoveryTokens.Count){
    return;
}
for (int j = 0;
j < i;
j++){
    Token t = errorRecoveryTokens[j];
    if (t.Type == TokenConstants.EOF){
        break;
    }
    if (followSet.Contains(t.Type)){
        break;
    }
    t = t.Next;
}
}
}