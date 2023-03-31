import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        float altura;
        float peso;
        char sexo = 0;
        try {
            Cliente cliente = new Cliente();

            System.out.println("Digíte o nome:");
            nome = scan.nextLine();
            cliente.setNome(nome);

            System.out.println("Digíte a idade:");
            idade = scan.nextInt();
            cliente.setIdade(idade);

            System.out.println("Digíte a altura:");
            altura = scan.nextFloat();
            cliente.setAltura(altura);

            System.out.println("Digíte o peso:");
            peso = scan.nextFloat();
            cliente.setPeso(peso);

            System.out.println("Digíte o sexo:"); //Java não possuí metódo para validar char. Necessário lançar dessa forma.
            sexo = (char) System.in.read();
            cliente.setSexo(sexo);

            cliente.printData();

        } catch (IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }
}