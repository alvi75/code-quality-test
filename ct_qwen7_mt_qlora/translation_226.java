import java.util.*;

public class Translation226 {
    1 public GetRepoWebhookLogListRequest() {
    super("cr", "2016-06-07", "GetRepoWebhookLogList");
    setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks/[WebhookId]/logs");
    setMethod(MethodType.GET);
}
}