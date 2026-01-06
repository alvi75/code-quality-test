import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
        int year = (int) (timeBucket / 10000);
        int month = (int) ((timeBucket % 10000) / 100);
        int day = (int) (timeBucket % 100);

        //if dayStep is 1, no need to reformat
        if(dayStep == 1)
            return timeBucket;

        //if dayStep is 7, reformat to the first day of the week
        if(dayStep == 7){
            int dayOfWeek = (day + 6) % 7;
            day -= dayOfWeek;
            day += 1;
            return year * 10000 + month * 100 + day;
        }

        //if dayStep is 11, reformat to the first day of the month
        if(dayStep == 11){
            day = 1;
            return year * 10000 + month * 100 + day;
        }

        //if dayStep is 12, reformat to the first day of the quarter
        if(dayStep == 12){
            int quarter = (month - 1) / 3 + 1;
            month = quarter * 3;
            day = 1;
            return year * 10000 + month * 100 + day;
        }

        //if dayStep is 13, reformat to the first day of the year
        if(dayStep == 13){
            month = 1;
            day = 1;
            return year * 10000 + month * 100 + day;
        }

        //if dayStep is 14, reformat to the first day of the half-year
        if(dayStep == 14){
            int halfYear = (month - 1) / 6 + 1;
            month = halfYear * 6;
            day = 1;
            return year * 10000 + month * 100 + day;
        }

        //if dayStep is 15, reformat to the first day of the year
        if(dayStep == 15){
            month = 1;
            day = 1;
            return year * 10000
}