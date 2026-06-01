public class Main {

    public static void main(String[] args) {

        SistemaDeChamado sistema =
                new SistemaDeChamado();

        sistema.adicionar(
                new Chamado(2,
                        "Troca de senha"));

        sistema.adicionar(
                new Chamado(5,
                        "Servidor fora do ar"));

        sistema.adicionar(
                new Chamado(3,
                        "Problema no e-mail"));

        sistema.adicionar(
                new Chamado(5,
                        "Banco de dados indisponível"));

        System.out.println(
                "Tamanho: " + sistema.tamanho());

        System.out.println(
                "Próximo: "
                        + sistema.consultarOProximo());

        while (sistema.tamanho() > 0) {

            System.out.println(
                    "Atendendo -> "
                            + sistema.proximo());
        }
    }
}