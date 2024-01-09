// Classe PrincipalCal
public class PrincipalCal {
    public static void main(String[] args) {
        // Criação de uma instância da classe Calculadora
        Calculadora calculadora = new Calculadora();

        // Chamada do método dobraNumero da instância calculadora
        int resultado = calculadora.dobraNumero(10);

        // Cálculo do divisor
        int divisor = resultado / 2;

        // Impressão do resultado
        System.out.println("O número dobrado " + divisor + " tem o valor de " + resultado + " com seu valor dobrado!");
    }
}