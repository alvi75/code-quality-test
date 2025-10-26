import java.util.*;

public class Translation45 {
    public void withFetcher(final ECSMetadataServiceCredentialsFetcher fetcher) {
    this.fetcher = fetcher;
    this.fetcher.setRoleName(getRoleName());
}
}