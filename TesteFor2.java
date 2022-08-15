public class TesteFor2 {
  public static void main(String[] args) {
    System.out.println("soma dos números");
    int soma = 0;
    for (int x = 0; x <= 20; x++) {
      soma = soma + x;
    }
    System.out.println(soma);

    // -------------------------------------------
    System.out.println();
    int numTabuada = 5;
    System.out.println("tabuada do n " + numTabuada);

    for (int y = 0; y <= 10; y++) {
      System.out.println(numTabuada * y);
    }
  }
}
