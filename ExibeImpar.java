public class ExibeImpar {
  public static void main(String[] args) {
    ExibeImpar varClasse; // declarando um tipo especial de dado, que pode receber a classe
    varClasse = new ExibeImpar(); // passando a classe (e seus métodos) para a variável
    varClasse.exibir(); // chamando o método
  }

  public void exibir(){ // método criado
    int cont = 1;
    while (cont <=20){
      if (cont % 2 != 0){
        System.out.println(cont + " é impar");
      }
      cont++;
    }
  }
}
