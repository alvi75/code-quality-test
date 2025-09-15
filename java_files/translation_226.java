import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_226 {
    public GetRepoWebhookLogListRequest() {
        super("cr", "2016-06-07", "GetRepoWebhookLogList", "cr");
        setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks/[WebhookId]/logs");
        setMethod(MethodType.GET);
    }
}