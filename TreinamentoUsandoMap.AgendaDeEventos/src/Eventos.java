public class Eventos {

    private String nomeEvento;
    private String nomeAtracao;

    public Eventos(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    @Override
    public String toString() {
        return "-Eventos [Nome do Evento: "+nomeEvento+", Nome da Atracao: "+nomeAtracao +"\n]";
    }
    
    
}
