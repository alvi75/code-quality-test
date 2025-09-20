using System;
using System.Collections.Generic;

public class Translation226
{
    public GetRepoWebhookLogListRequest(): base("cr", "2016-06-07", "GetRepoWebhookLogList", "cr", "openAPI"){
    UriPattern = "/repos/[RepoNamespace]/[RepoName]/webhooks/[WebhookId]/logs";
    Method = MethodType.GET;
}
}