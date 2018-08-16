import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Dispatcher {


    private List<Cashier> cashiers = new ArrayList<>();
    private List<Supervisor> supervisors = new ArrayList<>();
    private Director director;

    ExecutorService executor = Executors.newFixedThreadPool(10);

    public Dispatcher() {
        createEmploys(7, 2, 1);
    }


    private Cashier obtainCashierAvailable() {
        for (Cashier cashier : cashiers) {
            if (cashier.isAvailability()) {
                return cashier;
            }
        }
        return null;
    }

    private Supervisor obtainSupervisorAvailable() {
        for (Supervisor supervisor : supervisors) {
            if (supervisor.isAvailability()) {
                return supervisor;
            }
        }
        return null;
    }

    private Director obtainDirectorAvailable() {
        if (director.isAvailability()) {
            return director;
        } else {
            return null;
        }
    }

    private void createEmploys(int numberCashier, int numberSupervisor, int numberDirector) {

        for (int i = 1; i <= numberCashier; i++) {
            cashiers.add(new Cashier("Cashier No:" + i, true, null));
        }

        for (int i = 1; i <= numberSupervisor; i++) {
            supervisors.add(new Supervisor("Supervisor No:" + i, true, null));
        }

        director=new Director("Director", true, null);

    }

    public void attend(List<Client> clients) {
        int i = 0;

        while (i < clients.size()) {

            Cashier cashierAvailable = obtainCashierAvailable();
            Supervisor supervisorAvailable = obtainSupervisorAvailable();
            Director directorAvailable = obtainDirectorAvailable();

            if (cashierAvailable != null) {
                cashierAvailable.setClient(clients.get(i));
                cashierAvailable.setAvailability(false);
                CompletableFuture
                        .supplyAsync(cashierAvailable, executor)
                        .thenAccept(response -> {
                            System.out.println(response + " Atention Time: " + cashierAvailable.getAttentionTime());
                            cashierAvailable.setAvailability(true);
                            cashierAvailable.setClient(null);
                        });
                i++;

            } else if (supervisorAvailable != null) {
                supervisorAvailable.setClient(clients.get(i));
                supervisorAvailable.setAvailability(false);
                CompletableFuture
                        .supplyAsync(supervisorAvailable, executor)
                        .thenAccept(response -> {
                            System.out.println(response + " Atention Time: " + supervisorAvailable.getAttentionTime());
                            supervisorAvailable.setAvailability(true);
                            supervisorAvailable.setClient(null);
                        });
                i++;

            } else if (directorAvailable != null) {
                directorAvailable.setClient(clients.get(i));

                directorAvailable.setAvailability(false);

                CompletableFuture
                        .supplyAsync(directorAvailable, executor)
                        .thenAccept(response -> {
                            System.out.println(response + " Atention Time: " + directorAvailable.getAttentionTime());
                            directorAvailable.setAvailability(true);
                            directorAvailable.setClient(null);

                        });
                i++;
            }


        }
        executor.shutdown();
    }


}



