import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path,String relativePath){
		if(relativePath==null || "".equals(relativePath))return path;
		
		String[] relativePathComponents=relativePath.split("/");
		int length=relativePathComponents.length;
		if(length==0)return path;
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<length;i++){
			String component=relativePathComponents[i];
			if(component.equals("..")){if(sb.length()>0)sb.deleteCharAt(sb.length()-1);
				continue;
			}
			else if(component.equals(".")){continue; }
			
			sb.append("/").append(component);
		}
		
		return PathNormalizer.asPathString(path+"/"+sb.toString());
	}
}