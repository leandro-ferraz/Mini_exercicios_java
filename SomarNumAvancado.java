import java.util.Scanner;

public class SomarNumAvancado {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int num = 0, cont, qtdNum, somaNum = 0;

    System.out.println("Informe a quantidade de numeros que deseja somar: ");
    qtdNum = x.nextInt();
    
    for(cont = 0; cont <= qtdNum-1; cont++){ //loop para somar a quantidade de vezes informada
      System.out.println("Digite o "+(cont+1)+"º número: ");
      num = x.nextInt();
      somaNum = somaNum + num;
    }
    System.out.println("O resultado da soma é: "+somaNum);
    x.close();
  }  
}
