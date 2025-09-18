public UpdateRepoWebhookRequest() {
    super("cr", "2016-06-07", "UpdateRepoWebhook", "cr");
    setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks/[WebhookId]");
    setMethod(MethodType.POST);
}