package model.iPhone;

import model.AparelhoTelefonico.AparelhoTelefonico;
import model.NavegadorInternet.NavegadorInternet;
import model.ReprodutorMusical.ReprodutorMusical;



public class iPhoneBastiao implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

        //Métodos AparelhoTelefonico
    public void ligar(String numero){
        System.out.printf("\nLigando para o número: %s \n", numero);
    }


    public void atender(){
        System.out.println("Ligação atendida e em andamento");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Ligação não atendida -> caiu na Caixa Postal");
    }

        //Métodos NavegadorInternet
    public void exibirPagina(String url){
        System.out.printf("\nExibindo página atual: %s \n", url);
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada!");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página...");
    }

        //Métodos ReprodutorMusical
    public void tocar(){
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
        System.out.printf("\nMúsica selecionada: %s \n", musica);
        tocar();
    }


}
