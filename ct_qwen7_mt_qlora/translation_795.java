import java.util.*;

public class Translation795 {
    1 public DBSnapshot describeDBSnapshot(String dbSnapshotIdentifier) {
    2 return describeDBSnapshot(new DescribeDBSnapshotsRequest().withDBSnapshotIdentifier(dbSnapshotIdentifier));
}
}