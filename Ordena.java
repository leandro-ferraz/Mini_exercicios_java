
import java.util.*; // importar o pacote utilidades

public class Ordena {
  public static void main(String[] args) {
    Scanner infor = new Scanner(System.in); 
    /*  1) definindo uma variável infor do tipo Scanner 
        2) passando (criando, instanciando) o método Scanner para a variável
        3) operação atribuída entre parênteses
    */
    int x, y;

    System.out.println("Digite o valor de X ");
    x = infor.nextInt(); // chamando o método nextIn da classe scanner (através do objeto infor)
    System.out.println("Digite o valor de y");
    y = infor.nextInt();
    System.out.println("---------------------");

    if (x > y) {
      System.out.println(y);
      System.out.println(x);
    } else {
      System.out.println(x);
      System.out.println(y);
    }
    infor.close();
  }
}
