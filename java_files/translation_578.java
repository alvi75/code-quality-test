import java.util.*;

public class Translation578 {
    0;
int firstSheet = linkTable.getFirstInternalSheetIndexForExtIndex(externSheetNumber);
if (firstSheet == -1){
    throw new InvalidOperationException("No sheet with index " + externSheetNumber + " found");
}
return firstSheet;
}
}