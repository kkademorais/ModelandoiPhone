package model.AparelhoTelefonico;


public interface AparelhoTelefonico {

    default void ligar(String numero){
        System.out.printf("\nLigando para o número: %s ", numero);
    }


    default void atender(){
        System.out.println("Ligação atendida e em andamento");
    }

    default void iniciarCorreioVoz(){
        System.out.println("Ligação não atendida -> caiu na Caixa Postal");
    }

}
