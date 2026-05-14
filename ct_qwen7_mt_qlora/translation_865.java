import java.util.*;

public class Translation865 {
    1 public DescribeLagsResult describeLags(2 DescribeLagsRequest request) {
    3 return invokeHttpClient(request, "GET", "/lag");
    4 }
}