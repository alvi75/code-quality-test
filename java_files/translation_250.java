ublic virtual NGit.Api.RevertCommand include(Ref commit){
    checkCallable();
    commits.add(commit);
    return this;
}