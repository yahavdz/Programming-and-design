import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.sort;


public class SeasonUtil {

    public static final Season[] SEASONS = Season.values();
    /*
    sort all seasonable objects
     */
    public static void sortSeasonable(Comparable[] seasonables) {
        sort(seasonables);
    }

    /*
    create a string reporting all seasonable objects
     */
    static String reportAll(Seasonable[] seasonables) {
        String report ="";
        for(Seasonable seas : seasonables)
            report += seas.toString();
        return report;
    }
}
