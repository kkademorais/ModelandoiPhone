package model.ReprodutorMusical;

public interface ReprodutorMusical {

    default void tocar(){
        System.out.println("Tocando música selecionada!");
    }

    default void pausar(){
        System.out.println("Música pausada...");
    }

    default void retomar(){
        System.out.println("Reprodução da música retomada!");
    }

    default void pular(){
        System.out.println("Passando para a próxima música...");
    }

    default void selecionarMusica(String musica){
        System.out.printf("\nMúsica selecionada: %s", musica);
    }

}
