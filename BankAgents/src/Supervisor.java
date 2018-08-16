import java.util.function.Supplier;

public class Supervisor implements Supplier<String> {


    private String name;
    private boolean status;
    private Client client;
    private int attentionTime;


    public Supervisor(String name, boolean status, Client client) {

        this.name = name;
        this.status = status;
        this.client = client;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String get() {
        return Attend();
    }

    public String Attend() {

        attentionTime=(int)Math.floor(Math.random()*(15-10+1)+(10));
        try {
            Thread.sleep(attentionTime*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name + " Attends client: "+client.getName()+ " Client Id: "+client.getId()+ " Operation: "+client.getOperation();
    }

    public int getAttentionTime() {
        return attentionTime;
    }

    public void setAttentionTime(int attentionTime) {
        this.attentionTime = attentionTime;
    }

    public Client getClient() {

        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isAvailability() {
        return status;
    }

    public void setAvailability(boolean status) {
        this.status = status;
    }

}
