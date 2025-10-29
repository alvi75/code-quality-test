import java.util.*;

public class Translation579 {
    0;
int i = 0;
while (i < command.Length && i < commandLine.Length && command[i] == commandLine[i]){
    ++i;
}
if (i == command.Length){
    return true;
}
else if (i == command.Length + 1 && commandLine[i] == ' '){
    return true;
}
return false;
}
}