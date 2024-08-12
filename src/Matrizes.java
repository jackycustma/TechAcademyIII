import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] Matriz = new int [3][3];

        for (int i = 0; i < 3 ; i++) {//linhas
            for (int j = 0; j < 3; j++) { //colunas
                System.out.println("Digite um número para a posiçao " + i + ", " + j);
                Matriz [i][j] = scanner.nextInt();
            }
        }
    }
}