public class FigTree extends Tree {

    /**
     * ctor for a fig tree
     * @param height of the tree
     * @param season the current season
     */
    FigTree(int height, Season season) {
        super(height,season,null);

        switch (season){
            case WINTER :
                leaves = false;
                fruit = false;
                break;
            case SPRING:
                leaves = true;
                fruit = false;
                leavesColor = Color.GREEN;
                break;
            case SUMMER:
                leaves = true;
                fruit = true;
                leavesColor = Color.GREEN;
                break;
            case FALL:
                leaves = true;
                fruit = false;
                leavesColor = Color.YELLOW;
                break;
        }
    }

    @Override
    public String toString() {
        return  "Fig tree. " + super.toString();
        }

    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (season){
            case WINTER :
                leaves = false;
                height += 20;
                break;
            case SPRING:
                leaves = true;
                leavesColor = Color.GREEN;
                height += 30;
                break;
            case SUMMER:
                fruit = true;
                height += 30;
                break;
            case FALL:
                fruit = false;
                leavesColor = Color.YELLOW;
                height += 20;
                break;
        }
    }
}
