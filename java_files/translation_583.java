import java.util.*;

public class Translationtranslation_583 {
    public GetFindings.FindingsRequest() {
        super("cr", "2016-06-07", "GetFindings", "cr");
        setUriFindingsPath("/repos/[RepoNamespace]/Findings");
        setMethodFindingsMethodFinders(new StaticCredentialsFindingsFinder());
        setMethodFindingsHandler(new DefaultFindingsHandler());
    }
}