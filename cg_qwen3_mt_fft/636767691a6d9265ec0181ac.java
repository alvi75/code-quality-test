import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path,String relativePath){
		if(path==null || path.length()==0)
			return null;
		if(relativePath==null || relativePath.length()==0)
			return path;
		if(relativePath.charAt(0)!=FOLDER_SEPARATOR_CHAR)
			relativePath=FOLDER_SEPARATOR_CHAR+relativePath;
		String[] pathParts=path.split(FOLDER_SEPARATOR);
		String[] relativePathParts=relativePath.split(FOLDER_SEPARATOR);
		List<String> parts=new ArrayList<String>();
		for(int i=0;i<pathParts.length;i++){
			if(i<relativePathParts.length){
				parts.add(pathParts[i]+relativePathParts[i]);
			}else{
				parts.addAll(Arrays.asList(pathParts));
				break;
			}
		}
		return FOLDER_SEPARATOR.join(parts);
	}
}