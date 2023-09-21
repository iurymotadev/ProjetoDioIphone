package dio;

public class NavegadorInternet implements Aplicativo {
    private String nomeApp = "Navegador de Internet";

    @Override
    public void iniciarApp() {
        System.out.println("Iniciando " + this.nomeApp + ".");
    }

    @Override
    public void encerrarApp() {
        System.out.println("Encerrando " + this.nomeApp + ".");
    }

    public void exibirPagina() {
        conectarPagina();
        System.out.println("Exibindo página.");
    }

    public void adicionarNovaAba() {
        conectarPagina();
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    private void conectarPagina() {
        System.out.println("Conectando à página.");
    }

}
