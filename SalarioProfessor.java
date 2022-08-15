public class SalarioProfessor {
  public static void main(String[] args) {
    int ht;
    double vh, pd, sb, td, sl;

    ht = 70; // hóras trabalhadas
    vh = 30; // valor da hora aula
    pd = 7.5; // percentual de desconto
    sb = ht * vh; // salário bruto
    td = (pd / 100) * sb; // total de desconto
    sl = sb - td; // salário líquido

    System.out.println("Salário bruto = " +sb);
    System.out.println("Salário líquido = " +sl);
  }
}
