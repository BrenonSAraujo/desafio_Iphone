
public class IPhone extends AparelhoTelefonico implements ReprodutorMusical, NavegadorNaInternet {
    
    private String sistemaOperacional = "Linux";

    @Override
    public void playMusic(String musica) {
        System.out.println("Reproduzindo música: " + musica);
    }

    @Override
    public void pauseMusic() {
        System.out.println("Música pausada.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Música parada.");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void adicionarAosFavoritos(String url) {
        System.out.println("Adicionando aos favoritos: " + url);
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
}
