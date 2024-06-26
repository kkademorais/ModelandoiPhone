package main;
import java.util.Scanner;
import java.util.Locale;
import model.NavegadorInternet.desktop;
import model.ReprodutorMusical.iPod;
import model.AparelhoTelefonico.telefone;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
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
            iPod ipod = new iPod();
            System.out.println("Digite a música que deseja ouvir: ");
            musica = scanner.next();

            ipod.selecionarMusica (musica);
            ipod.pausar();
            ipod.retomar();
            ipod.pular();

        }
        else if(app.equals("tel")){
            telefone tel = new telefone();
            System.out.println("Digite o telefone que deseja discar: ");
            numero = scanner.next();

            tel.ligar(numero);
            tel.atender();
            tel.iniciarCorreioVoz();

        }
        else if(app.equals("net")){
            desktop net = new desktop();
            System.out.println("Digite o endereço do site que deseja navegar: ");
            url = scanner.next();

            net.exibirPagina(url);
            net.atualizarPagina();
            net.adicionarNovaAba();

        }

    }
}
