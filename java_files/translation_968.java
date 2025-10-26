ublic UpdateRepoWebhookRequest(): base("cr", "2016-06-07", "UpdateRepoWebhook", "cr", "openAPI"){
    UriPattern = "/repos/{
        RepoNamespace}
        /{
            RepoName}
            /webhooks/{
                WebhookId}
                ";
                Method = MethodType.POST;
            }