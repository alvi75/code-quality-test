import java.util.*;

public class Translation381 {
    public void add(FieldInfos other) {
    assert assertNotFinished();
    for(FieldInfo fieldInfo : other){
        add(fieldInfo);
    }
}
}