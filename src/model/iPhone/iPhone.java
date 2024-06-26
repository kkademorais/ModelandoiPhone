package model.iPhone;

import java.util.Scanner;
import java.util.Locale;
import main.iPhoneBastiao;

public class iPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        iPhoneBastiao iphone = new iPhoneBastiao();

        String app;
        String musica;
        String numero;
        String url;

        System.out.println("**iPhone**");
        System.out.println("iPod - Reprodutor Musical (ipod)");
        System.out.println("Telefone - Aparelho Telefônico (tel)");
        System.out.println("Desktop - Navegador da Internet (net)");
        System.out.println("Digite qual aplicativo do iPhone você quer desfrutar: ");
        app = scanner.next();

        if(app.equals("ipod")){

            System.out.println("Digite a música que deseja ouvir: ");
            musica = scanner.next();

            iphone.selecionarMusica (musica);
            iphone.pausar();
            iphone.retomar();
            iphone.pular();

        }
        else if(app.equals("tel")){

            System.out.println("Digite o telefone que deseja discar: ");
            numero = scanner.next();

            iphone.ligar(numero);
            iphone.atender();
            iphone.iniciarCorreioVoz();

        }
        else if(app.equals("net")){

            System.out.println("Digite o endereço do site que deseja navegar: ");
            url = scanner.next();

            iphone.exibirPagina(url);
            iphone.atualizarPagina();
            iphone.adicionarNovaAba();

        }


    }
}
