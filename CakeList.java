import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * List of all cakes in an order.
 * Contain info such as name of each cake, number of each cake.
 */
public class CakeList {
    private List<String> listOfName;
    private HashMap<String, Integer> mapOfCake;
    private int totalCakes;
    /**
     * default constructor.
     */
    public CakeList(){
        this.listOfName = new ArrayList<>();
        this.mapOfCake = new HashMap<>();
        this.totalCakes = 0;
    }

    /**
     * add new cake to the list.
     * algorithm using a hashmap to put info of ordered cakes.
     * @param newCake
     */

    public void addCake(Cake newCake){
        String key = newCake.getName();
        int val = newCake.getNumberOfCakes();
        int currentVal = 0;
        if(this.mapOfCake.containsKey(key)){
            currentVal = mapOfCake.get(key);
            this.mapOfCake.replace(key,val+currentVal);
            this.listOfName.add(key);
            currentVal = 0;
        }else{
            this.mapOfCake.put(key,val);
        }

        totalCakes+=val;
    }

    /**
     * get the list of all cakes and number of each cake ordered.
     * algorithm using list of name, each name is a key to get val from the map.
     * @return list of ordered cakes.
     */
    public String getList(){
        String theList = "";
        String currentCake = "";
        int val = 0;
        for(String key:listOfName){
            val = this.mapOfCake.get(key);
            currentCake = "\n\t\tNumber of " + key+ ": "+ val;
            theList+= currentCake;
            currentCake="";
        }
        return theList;
    }

}
