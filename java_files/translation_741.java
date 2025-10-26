ublic InsertTagsRequest(){
    BaseRequest = new CommonRequest();
    RequestParameters = new TypeValueMap();
    SetUrlParameter("Action", "InsertTags");
    SetUrlParameter("Version", "2018-05-01");
}