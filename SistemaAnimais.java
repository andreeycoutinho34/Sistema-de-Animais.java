//Importa a biblioteca Scanner
import java.util.Scanner;

//Cria a classe Animal
class Animal {
    //Método para o animal emitir som
    public void emitirSom() {
        System.out.println("Som genérico de animal...");
    }

    //Método para o animal dormir
    public void dormir() {
        System.out.println("Zzzzz...");
    }
}
//Cria as subclasses
class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

class Vaca extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Mooo!");
    }
}

class Ovelha extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Meee!");
    }
}

class Pintinho extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Piiii!");
    }
}

class Peixe extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Glub Glub!");
    }
}

//Cria a classe SistemaAnimais
public class SistemaAnimais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = null;

        //Cria um menu de interaçao com o usuario
        while (true) {
            System.out.println("\n--- MENU DE ANIMAIS ---");
            System.out.println("1 - Cachorro");
            System.out.println("2 - Gato");
            System.out.println("3 - Vaca");
            System.out.println("4 - Ovelha");
            System.out.println("5 - Pintinho");
            System.out.println("6 - Peixe");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            //Se a opcao for 7, encerra o programa
            if  (opcao == 7) {
                System.out.println("Encerrando o programa...");
                break;
            }

            //Cria um animal de acordo com a opcao escolhida
            switch (opcao) {
                case 1:
                    animal = new Cachorro();
                    break;
                case 2:
                    animal = new Gato();
                    break;
                case 3:
                    animal = new Vaca();
                    break;
                case 4:
                    animal = new Ovelha();
                    break;
                case 5:
                    animal = new Pintinho();
                    break;
                case 6:
                    animal = new Peixe();
                    break;
                default:
                    System.out.println("Escolha inválida! Tente novamente...");
                    continue;
            }

            //Cria um sub menu de interaçao com o usuario
            while (true) {
                System.out.println("\n--- AÇÕES ---");
                System.out.println("1 - Emitir Som");
                System.out.println("2 - Dormir");
                System.out.println("3 - Voltar ao Menu Principal");
                System.out.print("Escolha uma opção: ");
                int acao = scanner.nextInt();

                //Se a opcao for 3, volta ao menu principal
                if (acao == 3) {
                    System.out.println("Voltando ao menu principal...");
                    break;
                }

                //Executa a acao escolhida
                switch (acao) {
                    case 1:
                        animal.emitirSom();
                        break;
                    case 2:
                        animal.dormir();
                        break;
                    default:
                        System.out.println("Escolha inválida! Tente novamente...");
                }
            }
        }

        //Fecha o scanner
        scanner.close();
    }
}
