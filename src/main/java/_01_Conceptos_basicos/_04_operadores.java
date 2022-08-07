package _01_Conceptos_basicos;

public class _04_operadores {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        //Aritméticos
        /*--- Suma ---*/
        int suma = num1 + num2;
        System.out.println("Resultado suma: " + suma + "\n");

        /*--- Resta ---*/
        int resta = num2 - num1;
        System.out.println("Resultado resta: " + resta + "\n");

        /*--- Multiplicación ---*/
        int multiplicacion = num1 * num2;
        System.out.println("Resultado multiplicación: " + multiplicacion + "\n");

        /*--- División ---*/
        int division = num2 / num1;
        System.out.println("Resultado división: " + division + "\n");

        /*--- Módulo ---*/
        int modulo = num2 % num1;
        System.out.println("Resultado módulo: " + modulo + "\n");

        //De asignación
        /*--- Asignación ---*/
        int num3 = num2;
        System.out.println("Asignación: " + num3 + "\n");

        /*--- Suma y asignación ---*/
        // num1 += num2 (num1 = num1 + num2)
        num3 += num2;
        System.out.println("Suma y asignación: " + num3 + "\n");

        /*--- Resta y asignación ---*/
        // num1 += num2 (num1 = num1 - num2)
        num3 -= num2;
        System.out.println("Resta y asignación: " + num3 + "\n");

        /*--- Multiplicación y asignación ---*/
        // num1 += num2 (num1 = num1 * num2)
        num3 *= num2;
        System.out.println("Multiplicación y asignación: " + num3 + "\n");

        /*--- División y asignación ---*/
        // num1 += num2 (num1 = num1 / num2)
        num3 /= num2;
        System.out.println("División y asignación: " + num3 + "\n");

        /*--- Módulo y asignación ---*/
        // num1 += num2 (num1 = num1 % num2)
        num3 %= num2;
        System.out.println("Módulo y asignación: " + num3 + "\n");

        //Relacionales
        /*--- Igualdad ---*/
        boolean igualdad = false;

        if (num1 == num2) {
            System.out.println("Iguales \n");
        }else {
            System.out.println("No iguales \n");
        }

        /*--- Distinto ---*/
        if (num1 != num2){
            System.out.println("Distintos \n");
        }else {
            System.out.println("No distintos \n");
        }

        /*--- Menor qué ---*/
        if (num1 < num2){
            System.out.println("Num1 es menor que num2 \n");
        }else {
            System.out.println("Num1 no es menor que num2 \n");
        }

        /*--- Mayor qué ---*/
        if (num1 > num2){
            System.out.println("Num1 es mayor que num2 \n");
        }else {
            System.out.println("Num1 no es mayor que num2 \n");
        }

        /*--- Menor o igual que ---*/
        if (num1 <= num2){
            System.out.println("Num1 es menor o igual que num2 \n");
        }else {
            System.out.println("Num1 no es menor o igual que num2 \n");
        }

        /*--- Mayor o igual que ---*/
        if (num1 >= num2){
            System.out.println("Num1 es mayor o igual que num2 \n");
        }else {
            System.out.println("Num1 no es mayor o igual que num2 \n");
        }

        //Incremento y decremento
        /*--- Post Incremento ---*/
        num2++;
        System.out.println("Post incremento: " + num2 + "\n");

        /*--- Pre Incremento ---*/
        ++num2;
        System.out.println("Pre incremento: " + num2 + "\n");

        /*--- Post Decremento ---*/
        num1--;
        System.out.println("Post decremento: " + num1 + "\n");

        /*--- Pre decremento ---*/
        --num1;
        System.out.println("Pre decremento: " + num1 + "\n");

        //especiales
        /*--- Casteo ---*/
        double numero = 1;
        //imprime el tipo de dato al que ha sido casteado
        System.out.println("Casteo: " + (((Object)(int)numero).getClass().getSimpleName()) + "\n");

        String numero2 = "20";
        int parseNumero2 = Integer.parseInt(numero2);
        System.out.println("texto: " + numero2 + " " + (((Object)numero2).getClass().getSimpleName()) + "\n");
        System.out.println("int: " + parseNumero2 + " " + (((Object)parseNumero2).getClass().getSimpleName()) + "\n");

        /*--- concatenación de cadenas ---*/
        String nombre = "Angie";
        String apellido = "Matiz";
        System.out.println("Nombre completo: " + nombre + " " + apellido);

        /*
        * Para aprender más del tema -> http://profesores.fi-b.unam.mx/carlos/java/java_basico2_5.html
        *  */
    }


}
