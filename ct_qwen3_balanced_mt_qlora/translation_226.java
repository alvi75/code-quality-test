import java.util.*;

public class Translation226 {
    ublic GetRepoWebhookLogListRequest() {
    super("cr", "2016-06-07", "GetRepoWebhookLogList", "cr");
    setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks/[WebhookId]/logs");
    setMethod(MethodType.GET);
}
}