import java.util.Map;
import java.util.TreeMap;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new TreeMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }   
    }
    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }
    public String pesquisarPorPalavra(String palavra){
        String buscarPalavra = null;
        if (!dicionarioMap.isEmpty()){
            buscarPalavra = dicionarioMap.get(palavra);
        }
        return buscarPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Dedicar", "Começar algo e ir até o conseguir.\n");
        dicionario.adicionarPalavra("Insistir", "Não deixar para depois oque pode fazer agora.\n");
        dicionario.adicionarPalavra("Melhorar", "A cada dia que passar, ser melhor que o dia anterior.\n");
        dicionario.adicionarPalavra("Calma", "Nem tudo deve ser feito as pressas.\n");
        dicionario.adicionarPalavra("Consiguir", "Tener un gallantmon shin.\n");

        dicionario.exibirPalavras();

        /*dicionario.removerPalavra("Dedicar");
        dicionario.exibirPalavras();*/

        System.out.println("Buscar palavra Dedicar: "+dicionario.pesquisarPorPalavra("Dedicar")); 

        
    }
}
