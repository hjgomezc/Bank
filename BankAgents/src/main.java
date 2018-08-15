import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // write your code here
        /*Thread cliente1=new Thread((Runnable) new Client("Heiner",01));
        Thread cliente2=new Thread((Runnable) new Client("Miguel",02));
        Thread cliente3=new Thread((Runnable) new Client("Paco",03));

        cliente1.start();
        cliente2.start();
        cliente3.start();*/

        List<Client> clients= new ArrayList<Client>();

        clients.add(new Client("Andres",1,BankOperation.Deposits));
        clients.add(new Client("Luis",2, BankOperation.ResolvingCustomerIsuees));
        clients.add(new Client("Pacho",3, BankOperation.Withdrawals));
        clients.add(new Client("Ana",4, BankOperation.ResolvingCustomerIsuees));
        clients.add(new Client("Maria",5, BankOperation.Deposits));
        clients.add(new Client("Carmen",6, BankOperation.Deposits));
        clients.add(new Client("Laura",7, BankOperation.Withdrawals));
        clients.add(new Client("Martin",8, BankOperation.ResolvingCustomerIsuees));
        clients.add(new Client("Luis",9, BankOperation.Deposits));
        clients.add(new Client("Camilo",10, BankOperation.Withdrawals));
        clients.add(new Client("Pablo",11, BankOperation.Deposits));






}
}
