public class Caribou extends Animal{

    //TODO how to add the color based on the previous season
    @Override
    public String toString() {
        return "Caribou{" +
                "weight=" + weight +
                ", the color has changed to =" + color +
                ", season=" + season +
                '}';
    }

    @Override
    public Season changeSeason() {
        season.next();
        if(season == Season.WINTER){
           color = color.WHITE;
           //TODO Migration south
        }
        if(season == Season.SPRING){
            color = color.BROWN;        }
        if(season == Season.FALL){
            //TODO Migration south
        }
        return season;
    }
}
