package main;

import model.iPhone.iPhoneBastiao;

import java.util.Scanner;
import java.util.Locale;

public class iPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        iPhoneBastiao iphone = new iPhoneBastiao();

        String app = "";
        String musica;
        String opcao1 = "";
        String numero;
        String opcao2 = "";
        String url;
        String opcao3 = "";

        while(!app.equals("exit")){
            System.out.println();
            System.out.println("**iPhone**");
            System.out.println("iPod - Reprodutor Musical (ipod)");
            System.out.println("Telefone - Aparelho Telefônico (tel)");
            System.out.println("Desktop - Navegador da Internet (net)");
            System.out.println("Sair (exit)");
            System.out.println("Digite qual aplicativo do iPhone você quer desfrutar: ");
            app = scanner.next();

            if(app.equals("ipod")){

                System.out.println();
                while(!opcao1.equals("exit")){
                    System.out.println();
                    System.out.println("Entramos no Reprodutor Musical iPod");
                    System.out.println("Selecionar Música (select)");
                    System.out.println("Pausar música atual (pause)");
                    System.out.println("Retomar reprodução atual (resume)");
                    System.out.println("Pular reprodução atual (skip)");
                    System.out.println("Sair (exit)");
                    System.out.println("Digite a opção desejada: ");
                    opcao1 = scanner.next();

                    if(opcao1.equals("select")){
                        System.out.println();
                        System.out.println("Digite a música que deseja ouvir: ");
                        musica = scanner.next();
                        iphone.selecionarMusica (musica);
                    }
                    else if(opcao1.equals("pause")){
                        System.out.println();
                        iphone.pausar();
                    }
                    else if(opcao1.equals("resume")){
                        System.out.println();
                        iphone.retomar();
                    }
                    else if(opcao1.equals("skip")){
                        System.out.println();
                        iphone.pular();
                    }



                }


            }
            else if(app.equals("tel")){

                System.out.println();
                while(!opcao2.equals("exit")){
                    System.out.println();
                    System.out.println("Entramos no Aparelho Telefônico Discador");
                    System.out.println("Discar e fazer uma ligação (call)");
                    System.out.println("Atender ligação (accept)");
                    System.out.println("Deixar tocar (ringing)");
                    System.out.println("Sair (exit)");
                    System.out.println("Digite a opção desejada: ");
                    opcao2 = scanner.next();
                    if(opcao2.equals("call")){
                        System.out.println();
                        System.out.println("Digite o telefone que deseja discar: ");
                        numero = scanner.next();

                        iphone.ligar(numero);
                    }
                    else if(opcao2.equals("accept")){
                        System.out.println();
                        iphone.atender();
                    }
                    else if(opcao2.equals("ringing")){
                        System.out.println();
                        iphone.iniciarCorreioVoz();
                    }

                }


            }
            else if(app.equals("net")){

                System.out.println();

                while(!opcao3.equals("exit")){
                    System.out.println();
                    System.out.println("Entramos no Navegador de Internet Safari");
                    System.out.println("Buscar página (search)");
                    System.out.println("Atualizar página atual (refresh)");
                    System.out.println("Adicionar nova aba (add)");
                    System.out.println("Sair (exit)");
                    System.out.println("Digite a opção desejada: ");
                    opcao3 = scanner.next();
                    if(opcao3.equals("search")){
                        System.out.println("Digite o endereço do site que deseja navegar: ");
                        url = scanner.next();
                        iphone.exibirPagina(url);
                    }
                    else if(opcao3.equals("refresh")){
                        iphone.atualizarPagina();
                    }
                    else if(opcao3.equals("add")){
                        iphone.adicionarNovaAba();
                    }



                }

            }
        }



    }
}
