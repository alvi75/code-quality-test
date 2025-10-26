ublic NGit.Api.LsRemoteCommand setRemote(String remote) {
    checkCallable();
    this.remote = remote;
    return this;
}