ublic ECSMetadataServiceCredentialsWithFetcher(IAWSClientBuilder builder, string roleName, ECSMetadataServiceCredentialsFetcher fetcher){
    builder.WithFetcher(fetcher);
    builder.WithRoleName(roleName);
}