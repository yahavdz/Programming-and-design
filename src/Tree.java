public abstract class Tree implements Seasonable,Comparable  {

    public int height;
    public Color color;
    public Season season;

    /**
     *Equates the height between objects
     * @param t Represents a tree-type object
     * @return
     */
    public int compareTo(Tree t) {
        return (this.height <t.height  ? -1 : ((this.height == t.height) ? 0 : 1));
    }

    /**
     * Changes the current season of the tree to the next season
     * @return the next season
     */
    public Season changeSeason() {
        return season.next() ;
    }

    /**
     * @return a string describing the current state of the tree
     */
    @Override
    public String toString() {
        return String.valueOf(height) + color.toString() + season.toString();
    }
}
