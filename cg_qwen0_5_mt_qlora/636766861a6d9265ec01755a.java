import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    /**If the match between the url and the pattern occurs, return the match result. Otherwise, return null.**/
public final MatchResult match(CharSequence uri){
        if (uri == null) {
            throw new IllegalArgumentException("The argument is null");
        }
        int index = 0;
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (c == '*') {
                //match zero or more times
                while (index < uri.length() && uri.charAt(index) == '*') {
                    index++;
                }
                if (index >= uri.length()) {
                    return MatchResult.MATCHED;
                }
            } else if (c == '?' || c == '[') {
                //match one time
                if (index < uri.length() && uri.charAt(index) == c) {
                    index++;
                } else {
                    return MatchResult.NOT_MATCHED;
                }
            } else if (c == '{' && index < uri.length() && uri.charAt(index) == '}') {
                //match a group
                index++;
                if (index >= uri.length()) {
                    return MatchResult.NOT_MATCHED;
                }
                String groupName = uri.substring(index);
                index += groupName.length();
                if (groupName.isEmpty()) {
                    return MatchResult.NOT_MATCHED;
                }
                if (pattern.charAt(i) != ']' && pattern.charAt(i) != '(') {
                    return MatchResult.NOT_MATCHED;
                }
                if (pattern.charAt(i) == ']') {
                    //match a group
                    Group group = new Group(groupName);
                    groups.add(group);
                    index++;
                } else if (pattern.charAt(i) == '(') {
                    //match a group
                    Group group = new Group(groupName);
                    groups.add(group);
                    index++;
                } else {
                    return MatchResult.NOT_MATCHED;
                }
            } else if (c == ']' && index < uri.length() && uri.charAt(index) == ']') {
                //match a group
                index++;
                if (index >= uri.length()) {
                    return MatchResult.NOT_MATCHED;
                }
                String groupName = uri.substring(index);
                index += groupName.length();
                if (groupName.isEmpty()) {
                    return MatchResult.NOT_MATCHED;
                }
                if (pattern.charAt(i) != '[' && pattern.charAt(i) != '(') {
                    return MatchResult.NOT_MATCHED;
                }
                if (pattern.charAt(i) == ']') {
}