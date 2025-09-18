public ECSMetadataServiceCredentialsProvider withFetcher(ecsMetadataServiceCredentialsFetcher fetcher) {
    this.fetcher = fetcher;
    this.fetcher.setRoleName(roleName);
    return this;
}