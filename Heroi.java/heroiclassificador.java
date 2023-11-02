import java.util.Scanner;

public class heroiclassificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o nome do seu Herói? ");
        String nomeHeroi = scanner.nextLine();

        System.out.print("Qual o nível de XP de " + nomeHeroi + ": ");
        int classeHeroi = scanner.nextInt();

        if (classeHeroi < 1000) {
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível Ferro");
        } else if (classeHeroi >= 1001 || classeHeroi < 2000) {
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível Bronze");
        } else if (classeHeroi >= 2001 || classeHeroi < 5000) {
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível Prata");
        } else if (classeHeroi >= 5001 || classeHeroi < 7000) {
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível Ouro");
        } else if (classeHeroi >= 7001 || classeHeroi < 8000) {
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível Platina");
        } else if (classeHeroi >= 8001 || classeHeroi < 9000) {
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível Ascendente");
        } else if (classeHeroi >= 9001 || classeHeroi < 10000) {
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível Imortal");
        } else {
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível Radiante");
        }
    }
}
