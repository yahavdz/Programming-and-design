public class Caribou extends Animal{
    String status;

    Caribou(int weight, Season season) {
        super(weight, season, Color.BROWN);
        changeColorAndStatusBySeason();
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
        changeColorAndStatusBySeason();
    }

    private void changeColorAndStatusBySeason() {
        switch (getCurrentSeason()) {
            case FALL:
                status = "in north";
                break;
            case SPRING:
                status = "in south";
                color = Color.BROWN;
                break;
            case SUMMER:
                status = "I am migrating north";
                break;
            case  WINTER:
                status = "I am migrating south";
                color = Color.WHITE;
                break;
        }
    }
}
