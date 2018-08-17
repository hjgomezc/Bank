import java.util.function.Supplier;

public class Admin implements Supplier<String> {

    private String name;
    private boolean status;
    private Client client;
    private int attentionTime;

    /**
     * Constructor of the class Admin
     * @param name
     * @param status
     * @param client
     */

    public Admin(String name, boolean status, Client client) {
        this.name = name;
        this.status = status;
        this.client = client;
    }

    @Override
    public String get() {
        return Attend();
    }

    /**
     * Create attention time  and sleep teh thread.
     * @return client
     */

    public String Attend() {

        attentionTime=(int)Math.floor(Math.random()*(15-10+1)+(10));
        try {
            Thread.sleep(attentionTime*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name + " Attends client: "+client.getName()+ " Client Id: "+client.getId()+ " Operation: "+client.getOperation();
    }


    /**
     * Get yhe attention time
     * @return attentionTime
     */
    public int getAttentionTime() {
        return attentionTime;
    }

    /**
     * Set the client of type Client
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }


    /**
     * Ckeck status
     * @return status
     */
    public boolean isAvailability() {
        return status;
    }

    /**
     * Set status of cashier, Director and supervisor
     * @param status
     */

    public void setAvailability(boolean status) {
        this.status = status;
    }
}
