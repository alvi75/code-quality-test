ublic ImportInstallationMediaResponse ImportInstallationMedia(ImportInstallationMediaRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ImportInstallationMediaRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ImportInstallationMediaResponseUnmarshaller.Instance;
    return Invoke<ImportInstallationMediaResponse>(request, options);
}