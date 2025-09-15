import java.util.*;

public class Translationtranslation_146 {
    public void unwriteProtectWorkbook() {
        getWorkbook().removeBuiltinRecord(NameRecord.BUILTIN_WRITEPROTECT);
        getWorkbook().removeBuiltinRecord(ProtectRecord.BUILTIN_WRITEPROTECT);
    }
}