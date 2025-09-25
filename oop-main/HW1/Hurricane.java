public class Hurricane {
    public static void main(String[] args) {
        int sucgio = Integer.parseInt(args[0]);

        if (sucgio < 65) System.out.println("Not a hurricane");
        else if (sucgio >= 65 && sucgio < 96) System.out.println("Class 1 hurricane");
        else if (sucgio >= 96 && sucgio < 111) System.out.println("Class 2 hurricane");
        else if (sucgio >= 111 && sucgio < 131) System.out.println("Class 3 hurricane");
        else if (sucgio >= 131 && sucgio < 155) System.out.println("Class 4 hurricane");
        else System.out.println("Class 5 hurricane");

    }
}
