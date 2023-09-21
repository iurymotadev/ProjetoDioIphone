package dio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class ReprodutorMusical implements Aplicativo {

    private String nomeApp = "ReprodutorMusical";

    @Override
    public void iniciarApp() {
        System.out.println("Iniciando " + this.nomeApp + ".");
    }

    @Override
    public void encerrarApp() {
        System.out.println("Encerrando " + this.nomeApp + ".");
    }

    public void tocarMusica() {
        System.out.println("Tocando música.");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

}
