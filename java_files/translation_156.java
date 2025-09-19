import java.util.*;

public class Translation156 {
    public static String insertId(String message, ObjectId changeId) {
    return insertId(message, changeId != null ? changeId.name() : "UNKNOWN");
}
}