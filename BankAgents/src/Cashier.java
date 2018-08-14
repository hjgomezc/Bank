import java.util.function.Supplier;

public class Cashier  implements Supplier {

    int id;
    String name;
    boolean status;

    public Cashier(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object get() {
        return Attend();
    }

    public String Attend() {

    }
}
