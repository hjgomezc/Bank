import java.util.function.Supplier;

public  class Director  extends Admin {

    /**
     * Constructor of class Director the which extend from Admin
     * @param name
     * @param status
     * @param client
     */

    public Director(String name, boolean status, Client client) {
        super(name, status, client);
    }
}
