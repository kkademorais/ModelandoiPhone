package model.ReprodutorMusical;

public class iPod {


    private void tocar(){
        System.out.println("Tocando música selecionada!");
    }

    public void pausar(){
        System.out.println("Música pausada...");
    }

    public void retomar(){
        System.out.println("Reprodução da música retomada!");
    }

    public void pular(){
        System.out.println("Passando para a próxima música...");
    }

    public void selecionarMusica(String musica){
        System.out.printf("\nMúsica selecionada: %s\n", musica);
        tocar();
    }

}
