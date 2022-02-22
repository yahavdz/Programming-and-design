import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();
    public static void sortSeasonable(Comparable[] seasonables) {
        // TODO: Implement.
        sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {
        // TODO: Implement.
        String report ="";
        for(Seasonable seas : seasonables)
            report += seas.toString();
        return report;
    }
}
