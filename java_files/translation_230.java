import java.util.*;

public class Translation230 {
    0;
int i = 0;
for (int j = 0;
j < commands.size();
j++){
    ReceiveCommand c = commands.get(j);
    if (c != null && !c.IsFastForward()){
        i++;
    }
}
return i;
}
}