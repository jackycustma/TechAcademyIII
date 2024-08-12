public class Vetores {
    public static void main(String[] args) {
        String[] comandosValidos = {"use", "help", "get", "inventory"};
        String comando = "use FILTRO with CAFÉ";

        //array
        String[] strings = comando.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (i == 0) {
                String cmd = strings[i];
                for (int j = 0; j < comandosValidos.length; j++) {
                    if (cmd.equalsIgnoreCase(comandosValidos[j])) {
                        System.out.println("comando válido: " + cmd);
                        break;
                    } else {
                        System.out.println("não entendi...");
                    }
                }


                System.out.println("primeiros comandos: " + strings[i]);
            } else {
                System.out.println("outros comandos: " + strings[i]);
            }
        }
    }
}