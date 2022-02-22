public abstract class Tree implements Seasonable,Comparable  {

    protected int height;
    protected Season season;
    protected Color leavesColor;
    protected boolean leaves;
    protected boolean fruit;

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    /**
     * @return the current season of the tree
     */
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    /**
     *Equates the height between objects
     * @param t Represents a tree-type object
     * @return
     */

    @Override
    public int compareTo(Object t) {
        return (Integer.compare(this.height, ((Tree) t).height));
    }

    /**
     * Changes the current season of the tree to the next season
     */
    public void changeSeason() {
        this.season = season.next() ;
    }

    /**
     * @return a string describing the current state of the tree
     */
    @Override
    public String toString() {
        String result = "";
        if (fruit)
            result+= " I give fruit.";
        result+= " My height is: "+ height;
        if (!leaves)
            result+= " and I have no leaves";
        else
            result+= " and My color is: "+ leavesColor;

        return String.valueOf(height) + leavesColor.toString() + season.toString();
    }
}
