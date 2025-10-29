import java.util.*;

public class Translation84 {
    0;
int i = 0;
for (int j = 0;
j < _escherRecords.Count;
j++){
    if (_escherRecords[j] is EscherContainerRecord){
        EscherContainerRecord container = (EscherContainerRecord)_escherRecords[j];
        if (container.ChildEscherRecords.Count > index){
            return container.ChildEscherRecords[index - i];
        }
        i += container.ChildEscherRecords.Count;
    }
}
throw new InvalidOperationException("No record found at index " + index);
}
}