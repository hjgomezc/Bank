public class Client {

    private String name;
    private int id;
    private BankOperation operation;

    public Client(String name, int id, BankOperation operation) {
        this.name = name;
        this.id = id;
        this.operation = operation;
    }

    public BankOperation getOperation() {
        return operation;
    }

    public void setOperation(BankOperation operation) {
        this.operation = operation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
