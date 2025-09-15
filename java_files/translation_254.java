import java.util.*;

public class Translationtranslation_254 {
    public ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute, OperationType operationType) {
        setSnapshotId(snapshotId);
        setAttribute(attribute.toString());
        setOperationType(operationType.toString());
    }
}