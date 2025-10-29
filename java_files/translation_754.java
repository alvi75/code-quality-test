import java.util.*;

public class Translation754 {
    0;
int i = 0;
for (int j = 0;
j < names.Count;
j++){
    if (i == index){
        continue;
    }
    else{
        names[j] = names[i];
    }
}
names.RemoveAt(index);
}
}