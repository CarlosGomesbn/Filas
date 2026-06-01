import java.util.*;

public class SistemaDeChamado {

    private final TreeMap<Integer, Queue<Chamado>> filas;
    private long tamanho;

    public SistemaDeChamado() {
        filas = new TreeMap<>(Collections.reverseOrder());
        tamanho = 0;
    }

    public void adicionar(Chamado chamado) {

        filas.computeIfAbsent(
                chamado.getPrioridade(),
                k -> new LinkedList<>()
        ).add(chamado);

        tamanho++;
    }

    public Chamado proximo() {

        for (Queue<Chamado> fila : filas.values()) {

            if (!fila.isEmpty()) {

                tamanho--;

                Chamado chamado = fila.poll();

                return chamado;
            }
        }

        return null;
    }

    public Chamado consultarOProximo() {

        for (Queue<Chamado> fila : filas.values()) {

            if (!fila.isEmpty()) {
                return fila.peek();
            }
        }

        return null;
    }

    public long tamanho() {
        return tamanho;
    }
}