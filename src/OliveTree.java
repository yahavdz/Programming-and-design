public class OliveTree extends Tree {

    /**
     * ctor for an olive tree
     * @param height of the tree
     * @param season the current season
     */
    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
        this.leaves = true;
        switch (getCurrentSeason()){
            case WINTER :
            case SPRING:
            case SUMMER:
                fruit = false;
                break;
            case FALL:
                fruit = true;
        }
    }

    @Override
    public String toString() {
        return  "Olive tree." + super.toString();
        }

    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (getCurrentSeason()){
            case WINTER :
                fruit = false;
                height += 5;
                break;
            case SPRING:
            case SUMMER:
                height += 10;
                break;
            case FALL:
                fruit = true;
                height += 5;
        }
    }
}
