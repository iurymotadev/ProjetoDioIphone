package dio;

public class Telefone implements Aplicativo {
    private String nomeApp = "Telefone";

    @Override
    public void iniciarApp() {
        System.out.println("Iniciando " + this.nomeApp + ".");
    }

    @Override
    public void encerrarApp() {
        System.out.println("Encerrando " + this.nomeApp + ".");
    }

    public void fazerLigacao() {
        System.out.println("Ligando.");
    }

    public void atenderLigacao() {
        receberLigacao();
        System.out.println("Atendendo ligação.");
    }

    public void encerrarLigacao() {
        System.out.println("Encerrando ligação.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Caixa postal, deixar mensagem.");
    }

    private void receberLigacao() {
        System.out.println("Ligação recebida.");
    }

}
