/**
 * Contains all info about customer.
 * Note: a customer is an order.
 * Each customer has a name, phone number, address, and a list of cakes they order.
 */
public class Customer {
    private String name;
    private String phone;
    private String address;
    private CakeList cakeList;

    /**
     * default constructor, create a customer with no info which can be added later.
     */
    public Customer(){
        this.name = "Please add a name";
        this.phone = "Please add a phone number for customer";
        this.address = "Please add an address";
        this.cakeList = new CakeList();
    }

    /**
     * constructor taking all available info.
     */
    public Customer(String name, String phone, String address, CakeList cakeList){
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.cakeList = cakeList;
    }

    /**
     * setter and getter for name.
     */
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    /**
     * setter and getter for phone number.
     */
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }

    /**
     * setter and getter for address.
     */
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

    /**
     * getter for list of cakes.
     */
    public String getOrderedList(){
        return this.cakeList.getList();
    }
}
