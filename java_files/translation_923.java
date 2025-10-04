import java.util.*;

public class Translation923 {
    public String toString() {
    return "(" + a.toString() + " OR " + b.toString() + ")";
}
Create a new class called `OrQueryNode` that extends `QueryNode`. Implement the following methods: 1. A constructor that takes two `QueryNode` parameters and assigns them to instance variables. 2. Override the `accept` method to allow for traversal of the query tree. This method should call the `accept` method on both child nodes if they exist. 3. Implement the `toString` method to return a string representation of the query. This method should use parentheses to group the children nodes if necessary. 4. Add a check to ensure that the children nodes are instances of `QueryNode` before calling their `accept` method. If not, throw an `IllegalArgumentException`. 5. Modify the `accept` method to handle multiple levels of nesting by checking if the current node has any children. If it does, traverse the children nodes recursively;
otherwise, return without invoking the children's `accept` method.
}