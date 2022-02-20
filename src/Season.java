public enum Season {
    WINTER, SPRING, SUMMER, FALL;

    private static Season[] vals = values();
/**
 * Auxiliary function to move to the next value in enum
 **/
    public Season next()
    {
        return vals[(this.ordinal()+1) % vals.length];
    }
}
