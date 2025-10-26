ublic ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute, OperationType operationType) {
    setSnapshotId(snapshotId);
    setAttribute(attribute);
    setOperationType(operationType);
}