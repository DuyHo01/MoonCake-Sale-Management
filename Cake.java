/**
 * All info about a moon cake.
 * There are many kinds of mooncakes, such as Lotus cake, Combination cake, bean cake, green tea cake.
 * Each cake has a specific number of egg york, in range of 0 to 2.
 */
public class Cake {
    private String name;
    private int eggs;
    private int numberOfCakes;
    /**
     * default constructor, create a cake with given, number of york is none.
     */
    public Cake(String name){
        this.name = name;
        this.eggs = 0;
        this.numberOfCakes = 1;
    }

    /**
     * constructor taking number of eggs and number of this kind of cake.
     */
    public Cake(String name, int eggs, int numberOfCakes){
        this.name = name;
        this.eggs = eggs;
        this.numberOfCakes = numberOfCakes;
    }

    /**
     * setter and getter for number of this cake.
     * @param numberOfCakes
     */
    public void setNumberOfCakes(int numberOfCakes){
        this.numberOfCakes = numberOfCakes;
    }
    public int getNumberOfCakes(){
        return this.numberOfCakes;
    }

    /**
     * getter for name.
     */
    public String getName(){
        return this.name;
    }

    /**
     * change the number of egg york.
     * sometimes customer wants to change.
     */
    public boolean changeNumYork(int numYork){
        boolean isSuccess = true;
        if(numYork < 0){
            System.out.println("Number of york cannot be negative. Are you ok?");
            isSuccess = false;
        }else if(numYork>2){
            System.out.println("You have that many eggs? I have only 2, so max is 2.");
            isSuccess = false;
        }
        this.eggs = numYork;
        return isSuccess;
    }

    /**
     * getter for number of eggs.
     */
    public int getEggs(){
        return this.eggs;
    }

    /**
     * Cake info such as name, number of york, number of cakes.
     */
    public void getInfo(){
        System.out.println(this.getName()+", "+this.getEggs()+" eggs, number of order: "+ this.getNumberOfCakes());
    }

    //-----------------------------------------main to test -----------------------------------------//
    public static void main(String[] args){
        Cake cake1 = new Cake("Thap cam");
        Cake cake2 = new Cake("Thap cam", 0, 2);
        Cake cake3 = new Cake("Sen", 2, 1);
        cake1.getInfo();
        cake1.changeNumYork(2);
        cake1.getInfo();
        cake2.getInfo();
        cake3.getInfo();
    }
}
