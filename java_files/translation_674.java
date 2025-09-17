import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_674 {
    public ListAssessmentTemplateVersionsRequest() {
        super("CloudTemplate", "2017-10-01", "ListAssitmentTemplates", "cloudphoto");
        setProtocolTemplateId("cloudphoto");
    }
    else {
        super("CloudPhoto", "2017-07-11", "GetImageStoreUsage", "cloudphoto");
        setProtocolTemplateId("cloudphoto:");
        setAcceptTemplateName("CloudPhoto");
        setMethodTemplateVersion("1.0");
        setStorageType("CloudPhoto");
        setFormatType("JSON");
    }
}