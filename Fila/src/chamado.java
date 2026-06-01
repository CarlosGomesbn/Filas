public class Chamado {

    private int prioridade;
    private String descricao;

    public Chamado(int prioridade, String descricao) {
        this.prioridade = prioridade;
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "[Prioridade=" + prioridade +
                ", Descricao='" + descricao + "']";
    }
}