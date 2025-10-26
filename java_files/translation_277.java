ublic RenameBranchCommand SetOldName(String oldName) {
    CheckCallable();
    this.oldName = oldName;
    return this;
}