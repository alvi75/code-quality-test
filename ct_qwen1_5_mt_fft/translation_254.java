import java.util.*;

public class Translation254 {
    public ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute, SnapshotModifyType modify) {
    setSnapshotId(snapshotId);
    setAttribute(attribute.toString());
    setOperationType(modify.toString());
}
}