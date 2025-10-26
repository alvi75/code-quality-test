ublic AddAlbumPhotosRequest(){
    BaseRequest = new CommonRequest();
    RequestParameters = new TypeValueMap();
    RequestParameters.Add("Action", "AddAlbumPhotos");
    RequestParameters.Add("albumId", albumId);
    RequestParameters.Add("photos", photos);
}