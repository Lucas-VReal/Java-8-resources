import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {


        List<Client> clientes = Arrays.asList(
                new Client("Michelli", true, "123", 5),
                new Client("Lucas", true, "456", 10),
                new Client("Maria", true, "789", 10)
        );

        Stream<Client> stream = clientes.stream().filter(c -> c.getPontos()>5);
        stream.forEach(c -> System.out.println(c));

        Stream<Integer> pontos = clientes.stream().map(c -> c.getPontos());
        pontos.forEach(p -> System.out.println(p+ " pontos"));




    }
}
