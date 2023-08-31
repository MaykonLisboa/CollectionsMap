import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Fernando", 111);
        agendaContatos.adicionarContato("Fernando", 112); 
        agendaContatos.adicionarContato("Jose", 113);
        agendaContatos.adicionarContato("Pedro", 114);
        agendaContatos.adicionarContato("Gabriel", 110);
        agendaContatos.adicionarContato("Gabriel Pires", 115);
        
        agendaContatos.exibirContatos();
        System.out.println("Pesquisar contato por nome: "+agendaContatos.pesquisarPorNome("Fernando"));


    }
}
