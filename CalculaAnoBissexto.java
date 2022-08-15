import java.util.Scanner;

public class CalculaAnoBissexto {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in); // criando um objeto para usar os métodos da classe scanner
    int ano;

    System.out.println("Informe o ano para saber se ele é bissesto: ");
    ano = x.nextInt();

    if (ano % 4 == 0) { //todo ano bissexto é divisível por 4
      System.out.println(" - " + ano + " é um ano bissexto");
    } else {
      System.out.println(" - " + ano + " NÃO é um ano bissexto");
    }
    x.close();
  }
}
