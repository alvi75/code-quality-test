import java.util.*;

public class Generated_636766801a6d9265ec017487 {
    public static String encodeTemplateNames(String s){
		StringBuffer sb = new StringBuffer();
		char[] chars = s.toCharArray();
		for(int i=0;i<chars.length;i++){
			if(chars[i]=='{'){
				sb.append(ENC_TEMPLATE_NAME_START);
			}else if(chars[i]=='}'){
				sb.append(ENC_TEMPLATE_NAME_END);
			}else{
				sb.append(chars[i]);
			}
		}
		return sb.toString();
	}
}