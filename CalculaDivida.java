import java.util.Scanner;

public class CalculaDivida {
  public static void main(String[] args) {
    Scanner entra = new Scanner(System.in); 
    //  criando uma var do tipo scanner e atribuindo a classe scanner com o parâmetro system.in
    double divida;
    float juros, dividaFinal;
    int qtdMeses;

    System.out.println("Valor da dívida: ");
    divida = entra.nextDouble();
    System.out.println("Numero de parcelas: ");
    qtdMeses = entra.nextInt();
    System.out.println("Juros de (%): ");
    juros = entra.nextFloat();

    dividaFinal = (float) (divida + (juros * (divida / 100))); // soma da dívida + juros
    System.out.println("-----------------------------------------");
    System.out.println("Total a pagar: R$ " + (float) dividaFinal);
    System.out.println("Valor da parcela: R$ " + (float) dividaFinal/qtdMeses);
    System.out.println("-----------------------------------------");
    entra.close();
  }
}
