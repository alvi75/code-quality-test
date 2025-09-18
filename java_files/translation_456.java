public GetRepoRequest() {
    super("cr", "2016-06-07", "GetRepo", "cr");
    setUriPattern("/repos/[RepoNamespace]/[RepoName]");
    setMethod(MethodType.GET);
}