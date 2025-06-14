package sr.sharp;

/**
 *
 * @author John
 */
import com.senac.projetosrsharp.model.CalculadoraPedido;
import com.senac.projetosrsharp.model.Servico;
import java.util.ArrayList;
import java.util.List;

public class SrSharp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando alguns serviços
        Servico alicate = new Servico(1L, "Afiação de alicate", 15.0);
        Servico tesoura = new Servico(2L, "Afiação de tesoura", 20.0);
        Servico faca = new Servico(3L, "Afiação de faca", 10.0);

        // Adicionando à lista de serviços do pedido
        List<Servico> servicos = new ArrayList<>();
        servicos.add(alicate);
        servicos.add(tesoura);
        servicos.add(faca);

        // Calculando o total
        double total = CalculadoraPedido.calcularTotal(servicos);

        // Exibindo resultado
        System.out.println("Serviços selecionados:");
        for (Servico s : servicos) {
            System.out.println("- " + s.getNome() + ": R$ " + s.getPreco());
        }

        System.out.println("\nTotal do pedido: R$ " + total);
    }
}
