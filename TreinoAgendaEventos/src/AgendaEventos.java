import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    
    private Map<LocalDate, Eventos> agendaEventos;

    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventos.put(data, new Eventos(nome, atracao));
    }    
    public void exibirAgenda(){
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(agendaEventos);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Eventos proximoEvento = null;

        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(agendaEventos);
        for (Map.Entry<LocalDate, Eventos> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Proximo evento: "+proximoEvento+", Data de estréia: "+proximaData);
                break;
            }
        }
    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 02), "Programação MAP", "1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 15), "Dog Day", "2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 25), "Aniversario 31 anos", "3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 27), "Aniversario 31 anos", "4");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

       
}
