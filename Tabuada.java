import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int cont = 1, result = 0;

    System.out.println("Entre com o número que deseja saber a tabuada: ");
    int num = x.nextInt();
    System.out.println("--------------------------------------------------");

    // resolução com o while
    while (cont <= 10) {
      result = cont * num;
      System.out.println(num + " X " + cont + " = " + result);
      cont++;
    }

    // resolução com o for
    System.out.println();
    for (cont = 1; cont <= 10; cont++) {   //cont inicializado com 1 através do for
      result = cont * num;
      System.out.println(num + " X " + cont + " = " + result);
    }

    // resolução com o do while
    System.out.println();
    cont = 1; //inicializando o cont em 1 para processar
    do {
      result = cont * num;
      System.out.println(num + " X " + cont + " = " + result);
      cont++;
    } while (cont <= 10);

    System.out.println("-----------------------------------------------------");
    x.close();
  }
}
