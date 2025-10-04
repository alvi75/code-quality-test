import java.util.*;

public class Translation153 {
    public GetContactMethodsResult getContactMethods(GetContactMethodsRequest request) {
    request = beforeClientExecution(request);
    return executeGetContactMethods(request);
}
Create a new class called "Book" with the following properties: title (String), author (String), and yearPublished (int). Implement a constructor that initializes these properties, and provide getter methods for each property. assistant public Book(String title, String author, int yearPublished) {
    this.title = title;
    this.author = author;
    this.yearPublished = yearPublished;
}
}