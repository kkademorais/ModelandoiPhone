package model.AparelhoTelefonico;

public class telefone {

    public void ligar(String numero){
        System.out.printf("\nLigando para o número: %s ", numero);
    }


    public void atender(){
        System.out.println("Ligação atendida e em andamento");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Ligação não atendida -> caiu na Caixa Postal");
    }

}
