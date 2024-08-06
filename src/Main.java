import java.util.Scanner;

public class Main {
    public static  void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro();

        System.out.println("Informe o modelo do carro");
        carro1.modelo = sc.next();
        System.out.println("Informe o ano do carro");
        carro1.ano = sc.nextInt();
        System.out.println("Informe a marca do carro");
        carro1.marca = sc.next();
        System.out.println("Informe a cor do carro");
        carro1.cor = sc.next();

        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Cor: " + carro1.cor);

        String isentoIpva = carro1.ehIsenIPVA(2024)?" issento" : "não isento";
        System.out.println("O " + carro1.modelo+ "" + isentoIpva + "do IPVA");

    }
}
