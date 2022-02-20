public abstract class Animal implements Seasonable,Comparable {
    public int weight;
    public Color color;
    public Season season;

    /**ss
     * @return the current season
     */
    public Season getCurrentSeason() {
        return season;
    }

    /**
     * Equates the weight between objects
     * @param o Represents a animal-type object
     * @return
     */
    @Override
    public int compareTo(Object o) {
        return (this.weight <((Animal)o).weight  ? -1 : ((this.weight == ((Animal)o).weight) ? 0 : 1));
    }

    /**
     * Changes the current season of The Animal to next season
     * @return the next season
     */
    @Override
    public Season changeSeason() {
       return season.next() ;
    }

    /**
     * @return a string describing the current animal state
     */
    @Override
    public String toString() {
        return String.valueOf(weight) + color.toString() + season.toString();
    }
}
