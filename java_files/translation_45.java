import java.util.*;

public class Translation45 {
    ublic ECSMetadataServiceCredentialsWithFetcher(IAWSClientBuilder builder, string roleName, ECSMetadataServiceCredentialsFetcher fetcher){
    builder.WithFetcher(fetcher);
    builder.WithRoleName(roleName);
}
}