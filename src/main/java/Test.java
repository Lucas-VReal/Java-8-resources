import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        var c1 = new Client("Michelli", true, "123", 0);
        var c2 = new Client("Lucas", true, "123", 0);

        List<Client> clients = Arrays.asList(c1, c2);

        //Old

//        for (Cliente cliente : clientes){
//            System.out.println(cliente.getName());
//        }

        // Quite Old

//        var sc = new ShowClient();
//        clients.forEach(sc); // consumer


        //Best Ways

//        clients.forEach(c-> System.out.println(c));
//        clients.stream().forEach(c -> System.out.println(c));

        //Lambda Expression

        Runnable r = () -> System.out.println("Olá Mundo");
        new Thread(r).start();

        //Default Method

        clients.forEach(Client::getName);
   }
}
