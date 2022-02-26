public class Bear extends Animal{

    Bear(int weight, Season season) {
        super(weight, season, Color.BROWN);
    }

    /**
     * @return A string describing the bear's change in the current season as well as the object's data
     */
    @Override
    public String toString() {
        Season season = getCurrentSeason();
        String str = "Bear. ";
        if(season == Season.WINTER){
           str += "I am sleeping. ";
        }
        return str + super.toString();
    }

    /**
     * Changes the current season of The Bear to next season
     * and update his weight according to the current season
     * @return the current season
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        Season season = getCurrentSeason();
        if(season == Season.WINTER){
            weight = (int) Math.floor(weight * 0.8);
        }
        if(season == Season.SPRING){
            weight = (int) Math.floor(weight * 0.75);
        }
        if(season == Season.FALL){
            weight = (int) Math.floor(weight*(5/4));
        }
        if(season == Season.SUMMER){
            weight = (int) Math.floor(weight*(4/3));
        }
    }
}
