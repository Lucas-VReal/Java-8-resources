import java.util.function.Consumer;

public class ShowClient implements Consumer<Client> {
    @Override
    public void accept(Client c) {
        System.out.println(c);
    }
}
