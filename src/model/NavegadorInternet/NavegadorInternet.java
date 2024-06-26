package model.NavegadorInternet;

public interface NavegadorInternet {

    default void exibirPagina(String url){
        System.out.printf("\nExibindo página atual: %s", url);
    }

    default void adicionarNovaAba(){
        System.out.println("Nova aba adicionada!");
    }

    default void atualizarPagina(){
        System.out.println("Atualizando página...");
    }

}
