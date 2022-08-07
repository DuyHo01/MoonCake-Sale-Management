import java.util.ArrayList;
import java.util.List;

/**
 * This class manages all the orders /aka customers.
 * For now, all cakes cost the same, which is $10 a cake.
 * At the end, we can print all the orders at once.
 */
public class Orders {
    private List<Customer> listOfCustomer;

    /**
     * default constructor.
     */
    public Orders(){
        this.listOfCustomer = new ArrayList<>();
    }

    /**
     * get the list of orders.
     */
    public String getList(){
        String returned = "";
        for(Customer currentCus: listOfCustomer){
            returned+= "\n "+ currentCus.getName()+ ",phone number: "+currentCus.getPhone()+
                    ", address: "+ currentCus.getAddress()+ ", cakes: " + currentCus.getOrderedList();
        }

        return returned;
    }
}
