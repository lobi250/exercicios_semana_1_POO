import javax.swing.JOptionPane;

public class Calculadora
{
   public static void main(String[] args)
   {
      int n1, n2, soma, subtracao, multiplicacao, divisao;
      
      n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro numero: "));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo numero: "));
      
      soma = n1 + n2;
      
      System.out.println("A soma dos dois numeros eh:" + soma);
      
      subtracao = n1 - n2;
      
      System.out.println("A subtracao dos dois numeros eh: " + subtracao);
      
      multiplicacao = n1 * n2;
      
      System.out.println("A multiplicacao dos dois numeros eh: " + multiplicacao);
      
      divisao = n1 / n2;
      
      System.out.println("A divisao dos dois numeros eh: " + divisao);
      
   }
}
