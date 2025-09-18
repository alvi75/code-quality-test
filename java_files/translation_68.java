public CreateRepoRequest() {
    super("cr", "2016-06-07", "CreateRepo", "cr");
    setUriPattern("/repos");
    setMethod(MethodType.PUT);
}