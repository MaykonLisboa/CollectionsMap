import java.util.HashMap;
import java.util.Map;

public class ContagemDePalavras {
    
    private Map<String, Integer> contagemPalavras;

    public ContagemDePalavras() {
        this.contagemPalavras = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavras.put(palavra, contagem);    
    }
    public void removerPalavra(String palavra){
        if (!contagemPalavras.isEmpty()){
            contagemPalavras.remove(palavra);
            System.out.println("Palavra "+palavra+" foi removido.");
        }    
    }
    public void exibirContagemPalavras(){
        System.out.println(contagemPalavras);
    }
    public void encontrarPalavraMaisFrequente() {
        if (!contagemPalavras.isEmpty()) {
            String palavraMaisFrequente = "";
            int maxFrequencia = 0;

            for (Map.Entry<String, Integer> c : contagemPalavras.entrySet()) {
                if (c.getValue() > maxFrequencia) {
                    maxFrequencia = c.getValue();
                    palavraMaisFrequente = c.getKey();
                }
            }

            System.out.println("Palavra mais frequente: " + palavraMaisFrequente + " (ocorrências: " + maxFrequencia + ")");
        } else {
            System.out.println("A contagem de palavras está vazia.");
        }
    }
    public static void main(String[] args) {
        ContagemDePalavras contagemDePalavras = new ContagemDePalavras();

        contagemDePalavras.adicionarPalavra("Fé", 3);
        contagemDePalavras.adicionarPalavra("Java", 5);
        contagemDePalavras.adicionarPalavra("Carpete", 2);
        contagemDePalavras.exibirContagemPalavras();

        contagemDePalavras.removerPalavra("Fé");
        contagemDePalavras.encontrarPalavraMaisFrequente();
        contagemDePalavras.exibirContagemPalavras();

    }
}
