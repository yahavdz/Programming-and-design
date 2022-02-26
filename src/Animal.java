public abstract class Animal implements Seasonable,Comparable {
    protected int weight;
    private Season season;
    protected Color color;

    Animal(int weight, Season season, Color color){
        this.weight = weight;
        this.season = season;
        this.color = color;
    }

    /**
     * @return the current season
     */
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    /**
     * Equates the weight between objects
     * @param o Represents a animal-type object
     * @return 1 if bigger, 0 if equal and -1 if smaller
     */
    @Override
    public int compareTo(Object o) {
        return (Integer.compare(this.weight, ((Animal) o).weight));
    }

    /**
     * Changes the current season of The Animal to next season
     */
    @Override
    public void changeSeason() {
       season = season.next() ;
    }

    /**
     * @return a string describing the current animal state
     */
    @Override
    public String toString() {
        return "My weight is: " + weight + " and my color is: " + color + "\n";
    }
}
