package dio;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.iniciarApp();
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();
        reprodutorMusical.encerrarApp();

        System.out.println();

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.iniciarApp();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.exibirPagina();
        navegadorInternet.atualizarPagina();
        navegadorInternet.encerrarApp();

        System.out.println();

        Telefone telefone = new Telefone();
        telefone.iniciarApp();
        telefone.fazerLigacao();
        telefone.iniciarCorreioVoz();
        telefone.atenderLigacao();
        telefone.encerrarLigacao();
        telefone.encerrarApp();

    }
}