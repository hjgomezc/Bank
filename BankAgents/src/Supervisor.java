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
        return name + " "+client.getName()+" "+client.getId()+" "+client.getOperation();
    }

    public boolean isAvailability() {
        return status;
    }

    public void setAvailability(boolean status) {
        this.status = status;
    }

}
