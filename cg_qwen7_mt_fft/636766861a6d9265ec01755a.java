import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri) {
		if(uri == null){
			throw new NullPointerException("uri is null");
		}
		
		int i = 0;
		int j = 0;

		final int length = this.pattern.length();
		final int uriLength = uri.length();

		while(i < length && j < uriLength){
			char c1 = this.pattern.charAt(i);
			char c2 = uri.charAt(j);

			switch(c1){
				case ':':
					if(Character.isLetterOrDigit(c2)){
						j++;
					}else{
						return null;
					}

					break;

				case '*':
					i++;
					j++;

					if(i >= length || j >= uriLength)
						return new MatchResultImpl(this.groups.toArray(new String[this.groups.size()]), this.sensitive);

					c1 = this.pattern.charAt(i);
					c2 = uri.charAt(j);

					continue;

				default:
					if(c1 != c2){
						return null;
					}

					i++;
					j++;
			}
		}

		if(i == length && j == uriLength){
			String[] values = this.values.toArray(new String[this.values.size()]);
			for(int k=0; k<values.length; ++k){
				values[k] = decode(values[k], encoding);
			}

			return new MatchResultImpl(values,this.sensitive);
		}

		return null;
	}
}