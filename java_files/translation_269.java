ublic CreateRepoBuildRuleRequest(): base("cr", "2016-06-07", "CreateRepoBuildRule", "cr", "openAPI"){
    UriPattern = "/repos/{
        RepoNamespace}
        /{
            RepoName}
            /rules";
            Method = MethodType.PUT;
        }