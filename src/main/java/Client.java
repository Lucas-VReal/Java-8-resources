import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Client {
    private String name;
    private boolean status;
    private String senha;
    private int pontos;


    public String getName() {
        System.out.println(this.name);
        return name;
    }
}
