import java.util.*;

public class Translation787 {
    public ListHyperParameterTuningJobsResult listHyperParameterTuningJobs(ListHyperParameterTuningJobsRequest request) {
    request = beforeClientExecution(request);
    return executeListHyperParameterTuningJobs(request);
}
Create a new class called "BookSheetKey" that contains bookIndex, sheetIndex, and lastSheetIndex as properties. Implement a constructor that initializes these properties, and override the "Equals" method to compare two BookSheetKeys for equality based on their bookIndex, sheetIndex, and lastSheetIndex properties.
}