import sun.font.TrueTypeFont;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.System.in;
import static java.lang.System.out;

public class Dispatcher {


    private List<Cashier> cashiers = new ArrayList<>();
    private List<Supervisor> supervisors = new ArrayList<>();
    private Director director;

    ExecutorService executor = Executors.newFixedThreadPool(10);

    public Dispatcher( ) {
        createEmploys(7,2,1);
    }



    private Cashier obtainCashierAvailable()
    {
        for(Cashier cashier:cashiers)
        {
            if(cashier.isAvailability()){return cashier;}
        }
        return null;
    }
    private Supervisor obtainSupervisorAvailable()
    {
        for(Supervisor supervisor:supervisors)
        {
            if(supervisor.isAvailability()){return supervisor;}
        }
        return null;
    }

    private Director obtainDirectorAvailable()
    {
        if(director.isAvailability()){return director;}
        else {

            return null;
        }
    }




    private void createEmploys(int numberCashier, int numberSupervisor, int numberDirector) {

        for (int i = 1; i <= numberCashier; i++) {
            cashiers.add(new Cashier("Cashier No:" + i, true, null));
        }

        for (int i = 1; i <= numberCashier; i++) {
            supervisors.add(new Supervisor("Supervisor No:" + i, true, null));
        }

        new Director("Director", true, null);

    }

}








    /*String msj;
    public Dispatcher(Client client, String msj) {
        this.client = client;
        this.msj = msj;
    }

    public void run(){
        for(int i=0; i<=10 ; i++){
            System.out.println(this.getName());
            System.out.println(this.getId());
        }*/


// public Dispatcher(client client) {
//   Client = client;

//{

//public  void attend() {
//}

    /*ExecutorService executor= Executors.newSingleThreadExecutor();
    executor.submit(() -> {

        String treadName= Thread.currentThread().getName();
        out.println("ss" +treadNameame );
    });*/


