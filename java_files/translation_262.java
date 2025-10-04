import java.util.*;

public class Translation262 {
    public TokenStream create(TokenStream input) {
    return new ElisionFilter(input, articles);
}
Create a function to check if a string is a valid filename according to the rules specified in the given code snippet. The function should return true if the filename is valid, false otherwise. Consider edge cases such as filenames with special characters or spaces. Normalize the filename by converting spaces to underscores before validation.
}