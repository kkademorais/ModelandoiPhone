package model.AparelhoTelefonico;

public class telefone {

    public void ligar(String numero){
        System.out.printf("\nLigando para o número: %s \n", numero);
    }
    public void atender(){
        System.out.println("Ligação atendida e em andamento!");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Ligação não atendida e enviada pra Caixa Postal!");
        System.out.println("Iniciando Correio de Voz!");
    }

}
