package model.ReprodutorMusical;

public class iPod {

    public void tocar(){
        System.out.println("Tocando música selecionada!");
    }
    public void pausar(){
        System.out.println("Música pausada!");
    }
    public void retomar(){
        System.out.println("Reprodução retomada!");
    }
    public void pular(){
        System.out.println("Pulando música atual!");
    }
    public void selecionarMusica(String musica){
        System.out.printf("\nMúsica selecionada: %s \n", musica);
    }

}
