import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
		int year = (int)(timeBucket/10000);
		int month = (int)((timeBucket%10000)/100);
		int day = (int)(timeBucket%100);

		if(dayStep>1){
			day -= dayStep-1;
			if(day<1) {
				month -= 1;
				if(month<1){
					year -= 1;
					month = 12;
				}
				day = DAYS_IN_MONTH[month-1];
			}
		}

		return year*10000+month*100+day;
	}
}