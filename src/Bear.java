public class Bear extends Animal{
    String status;
    /**
     * @return A string describing the bear's change in the current season as well as the object's data
     */
    @Override
    public String toString() {
        if(season == Season.WINTER){
            return "Bear{" +
                    "The weight dropped by 80%=" + weight +
                    ", color=" + color +
                    ", season=" + season +
                    '}';
        }
        else if(season == Season.SPRING){
            return "Bear{" +
                    "The weight dropped by 75%=" + weight +
                    ", color=" + color +
                    ", season=" + season +
                    '}';
        }
        else if(season == Season.FALL){
            return "Bear{" +
                    "The weight increased by 25%=" + weight +
                    ", color=" + color +
                    ", season=" + season +
                    '}';
        }
        else return "Bear{" +
                    "The weight increased by 33%=" + weight +
                    ", color=" + color +
                    ", season=" + season +
                    '}';
    }

    /**
     * Changes the current season of The Bear to next season
     * and update his weight according to the current season
     * @return the current season
     */
    @Override
    public Season changeSeason() {
        season.next();
        if(season == Season.WINTER){
            weight = (int) Math.floor(weight*0.8);
            status = "sleep";
        }
        if(season == Season.SPRING){
            weight = (int) Math.floor(weight*0.75);
            status = "wake";
        }
        if(season == Season.FALL){
            weight = (int) Math.floor(weight*(5/4));
            status = "wake";
        }
        if(season == Season.SUMMER){
            weight = (int) Math.floor(weight*(4/3));
            status = "wake";
        }
        color = Color.BROWN;
        return season;
    }
}
