import java.util.function.Supplier;

public class Supervisor extends Admin {

    /**
     * Constructor of class supervisor the which extend from Admin
     * @param name
     * @param status
     * @param client
     */

    public Supervisor(String name, boolean status, Client client) {
        super(name, status, client);
    }
}
