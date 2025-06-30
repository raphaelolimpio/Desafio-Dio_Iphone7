public  class Iphone implements MusicPlayer, Phone, NavegadorInternet {

    @Override
    public void playMusic() {
        System.out.println("the smartphone is playing music ");
    }

    @Override
    public void pauseMusic() {
        System.out.println("the smartphone is pausing music ");
    }

    @Override
    public void SelectMusic(String music) {
        System.out.println("the smartphone is selecting " + music);
    }

    @Override
    public void ExibirPagina(String url) {
        System.out.println("the smartphone is displaying the page " + url + " in the browser");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("the smartphone is adding a new tab in the browser");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("the smartphone is refreshing the page in the browser");
        }

    @Override
    public void Ligar(String numero) {

        System.out.println("the smartphone is calling " + numero);
    }

    @Override
    public void Atender() {
        System.out.println("the smartphone is answering the call");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("the smartphone is starting voicemail");
    }


}
