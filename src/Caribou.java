public class Caribou extends Animal{
    String status;

    //TODO how to add the color based on the previous season (?)
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
           status = "Migration south";
        }
        if(season == Season.SPRING){
            color = color.BROWN;
            status = "in south";
        }
        if(season == Season.FALL){
            status = "in north";
        }
        if(season == Season.SUMMER){
            status = "Migration north";
        }

        return season;
    }
}
