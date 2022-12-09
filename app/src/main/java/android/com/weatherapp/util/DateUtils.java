package android.com.weatherapp.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String getReadableDateFroLong(long dateinMillis) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
        String dateString = formatter.format(new Date(dateinMillis * 1000));

        return dateString;
    }
}
