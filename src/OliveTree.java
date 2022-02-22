public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);

        switch (season){
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
        return  "Olive tree. " + super.toString();
        }
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (season){
            case WINTER :
                fruit = false;
                height += 5;
                break;
            case SPRING:
            case SUMMER:
                height += 10;;
                break;
            case FALL:
                fruit = true;
                height += 5;
        }
    }
}
