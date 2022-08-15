import java.util.Scanner;

public class AreaCirculo {
  public static void main(String[] args) {
    Scanner infor = new Scanner(System.in);
    int raio;
    double area, potencia, pi = Math.PI;

    System.out.println("Área do círculo");
    System.out.println("Digite o valor do raio");
    raio = infor.nextInt(); // chamando o método nextIn da classe scanner (através do objeto infor)

    potencia = Math.pow(raio, 2);
    area = pi * potencia;
    System.out.println("A área do círculo é: "+ (float)area); // o float está convertendo o tipo
    infor.close();
  } 
}
