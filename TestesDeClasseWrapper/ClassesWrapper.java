package TestesControleFluxo;

public class ClassesWrapper {
    public static void main(String[] args) {
        // byte, short, int,     long, float, double e char
        // Byte, Short, Integer, Long, Float, Double e Character
        int x = 5;
        Integer i = new Integer(5);

        byte y = i.byteValue();

        String valor = "15.5";
        Float v = new Float(valor);
        System.out.println(v + 3);

        int idade = Integer.parseInt("27"); //parseXXX
        System.out.println("Daqui a 5 anos vc terá: " + (idade + 5) + "anos");

        try {
            double custo = Double.parseDouble("23.5");
            System.out.println("Custo total: " + custo);
        } catch (NumberFormatException e){
            System.err.println("numero invalido para conversão");
        }

    }
}
