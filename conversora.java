import javax.swing.JOptionPane;

public class conversora{
    public static void main(String [] args){
    String valorDolarString = JOptionPane .showInputDialog(null, "Digite o valor dolar", "Conversao dolar real", JOptionPane.QUESTION_MESSAGE);
    double valorDolar = Double.parseDouble(valorDolarString);
    String cotacaoDolarString = JOptionPane.showInputDialog(null,"Cotaçao em reais", "Conversao dolar real ", JOptionPane.QUESTION_MESSAGE);
    double cotacaoDolar = Double.parseDouble(cotacaoDolarString);
    double valorReal = valorDolar *cotacaoDolar;
    JOptionPane.showMessageDialog(null,"VALOR EM REAIS " + String.format("%.2f", valorReal), "Valor convertido",JOptionPane.INFORMATION_MESSAGE);
    String valorLibrasString = JOptionPane .showInputDialog(null,  " Digite o valor da libra" , "Digite a conversao libra real", JOptionPane.QUESTION_MESSAGE);
    double valorLibras = Double.parseDouble(valorLibrasString);
    String cotaçaoLibraString =  JOptionPane .showInputDialog(null,"Cotaçao em reais", "Coversao libra real", JOptionPane.QUESTION_MESSAGE);
    double cotaçaoLibras = Double.parseDouble(cotaçaoLibraString);
    double valorRealL = valorLibras * cotaçaoLibras ; 
    JOptionPane.showMessageDialog(null,"VALOR EM REAIS " + String.format("%.2f", valorRealL), "Valor convertido",JOptionPane.INFORMATION_MESSAGE);

    
    }
    
}