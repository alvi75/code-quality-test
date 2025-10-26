ublic AssociateWebsiteAuthorizationProviderResponse AssociateWebsiteAuthorizationProvider(AssociateWebsiteAuthorizationProviderRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AssociateWebsiteAuthorizationProviderRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AssociateWebsiteAuthorizationProviderResponseUnmarshaller.Instance;
    return Invoke<AssociateWebsiteAuthorizationProviderResponse>(request, options);
}