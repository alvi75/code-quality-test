import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri){
		if(uri == null || uri.length() == 0)
			return null;
		
		int index = 0;
		for(int i=0; i<uri.length(); i++){
			char c = uri.charAt(i);
			if(c == '/' && index < pattern.length())
				index++;
		}
		if(index >= pattern.length())
			return null;
		
		MatchResult mr = new MatchResult();
		mr.matched = true;
		mr.index = index;
		mr.pattern = pattern;
		mr.uri = uri;
		mr.group = group;
		mr.groupIndex = groupIndex;
		mr.groupName = groupName;
		mr.groupNameIndex = groupNameIndex;
		mr.groupNameValue = groupNameValue;
		mr.groupNameValueIndex = groupNameValueIndex;
		mr.groupNameValueName = groupNameValueName;
		mr.groupNameValueNameIndex = groupNameValueNameIndex;
		mr.groupNameValueNameValue = groupNameValueNameValue;
		mr.groupNameValueNameValueIndex = groupNameValueNameValueIndex;
		mr.groupNameValueNameValueName = groupNameValueNameValueName;
		mr.groupNameValueNameValueNameIndex = groupNameValueNameValueNameIndex;
		mr.groupNameValueNameValueNameValue = groupNameValueNameValueNameValue;
		mr.groupNameValueNameValueNameValueIndex = groupNameValueNameValueNameValueIndex;
		mr.groupNameValueNameValueNameValueName = groupNameValueNameValueNameValueName;
		mr.groupNameValueNameValueNameValueNameIndex = groupNameValueNameValueNameValueNameIndex;
		mr.groupNameValueNameValueNameValueNameValue = groupNameValueNameValueNameValueNameValue;
		mr.groupNameValueNameValueNameValueNameValueIndex = groupNameValueNameValueNameValueNameValueIndex;
		mr.groupNameValueNameValueNameValueNameValueName = groupNameValueNameValueNameValueNameValueName;
		mr.groupNameValueNameValueNameValueNameValueNameIndex = groupNameValueNameValueNameValueNameValueNameIndex;
		mr.groupNameValueNameValueNameValueNameValueNameValue = groupNameValueNameValueNameValueNameValueNameValue;
		mr.groupNameValueNameValueNameValueNameValueNameValueIndex = groupNameValueNameValueNameValueNameValueNameValueIndex;
		mr.groupNameValueNameValueNameValueNameValueName
}