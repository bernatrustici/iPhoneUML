public class TocarMusica implements MusicPlayer
{
    @Override
    public void tocar() {
        System.out.println("");
        System.out.println("Tocando música");
        System.out.println("");
    }

    @Override
    public void pausar() {
        System.out.println("");
        System.out.println("Música em pausa");
        System.out.println("");
    }

    @Override
    public void selecionarMusica(String music) {
        System.out.println("");
        System.out.println("Música selecionada: " + music);
        System.out.println("");
    }
}
