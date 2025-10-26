ublic BatchRefUpdate addCommand(Collection<ReceiveCommand> cmd) {
    addAll(cmd);
    return this;
}