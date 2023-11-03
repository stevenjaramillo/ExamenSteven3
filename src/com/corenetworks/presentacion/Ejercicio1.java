public class Ejercicio1 {
    public static void main(String[] args) {
        // 1) Realizar codigo para mostrar por consola la IP Clase C 192.168.2.
        // dando lugar a 255.255.255.0.

        int[] numeros = new int[5];
        numeros [0] = 192;
        numeros [1] = 168;
        numeros [2] = 2;
        numeros [3] = 0;
        int mascara = 255;

        for (int i = 0; i<mascara ; i++){
            System.out.println(numeros [3] + mascara);
        }






        }
}
