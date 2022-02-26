public class Caribou extends Animal{
    String status;

    Caribou(int weight, Season season) {
        super(weight, season, Color.BROWN);
        changeAndColorStatusBySeason();
    }

    @Override
    public String toString() {
        Season season = getCurrentSeason();
        String str = "Caribou: ";
        if(season == Season.SUMMER || season == Season.WINTER){
            str = str + status + ". ";
        }
        return str + super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        changeAndColorStatusBySeason();
    }

    private void changeAndColorStatusBySeason() {
        switch (getCurrentSeason()) {
            case FALL:
                status = "in north";
                break;
            case SPRING:
                status = "in south";
                color = Color.WHITE;
                break;
            case SUMMER:
                status = "Migration north";
                break;
            case  WINTER:
                status = "Migration south";
                color = Color.BROWN;
                break;
        }
    }
}
