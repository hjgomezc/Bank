import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

/**
 *  Create a List of clients acording with the constructor of the Client class.
 */
        List<Client> clients = new ArrayList<Client>();

        clients.add(new Client("Andres", 1, BankOperation.Deposits));
        clients.add(new Client("Luis", 2, BankOperation.ResolvingCustomerIssuees));
        clients.add(new Client("Pacho", 3, BankOperation.Withdrawals));
        clients.add(new Client("Ana", 4, BankOperation.ResolvingCustomerIssuees));
        clients.add(new Client("Maria", 5, BankOperation.Deposits));
        clients.add(new Client("Carmen", 6, BankOperation.Deposits));
        clients.add(new Client("Laura", 7, BankOperation.Withdrawals));
        clients.add(new Client("Martin", 8, BankOperation.ResolvingCustomerIssuees));
        clients.add(new Client("Luis", 9, BankOperation.Deposits));
        clients.add(new Client("Camilo", 10, BankOperation.Withdrawals));
        clients.add(new Client("Pablo", 11, BankOperation.Deposits));
        clients.add(new Client("Carol", 12, BankOperation.Deposits));
        clients.add(new Client("Heiner", 13, BankOperation.Deposits));
        clients.add(new Client("Carlos", 14, BankOperation.Deposits));
        clients.add(new Client("Fernando", 15, BankOperation.Deposits));

/**
 * Create a dispatcher
 */
        Dispatcher dis = new Dispatcher();
        dis.attend(clients);


    }
}
