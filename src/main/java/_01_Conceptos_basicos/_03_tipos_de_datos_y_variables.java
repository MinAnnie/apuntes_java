package _01_Conceptos_basicos;

public class _03_tipos_de_datos_y_variables {
    public static void tiposDeDatos(){
        /*
        * Tipo de dato + nombre de variable = valor;
        * */

        /*--- Tipos primitivos ---*/
        //numéricos
        /*--- Enteros ---*/
        byte tipoByte = 1; //su rango de valores es de -128 a 127
        short tipoShort = 2; //su rango de valores es de -32.768 a 32.767
        int tipoInt = 3; //su rango de valores es de -231 a 231-1
        long tipoLong = 4; //su rango de valores es de -263 a 263-1.

        /*--- Decimales ---*/
        //debemos agregar al lado del número decimal su letra en minuscula para indicar que es
        //de tipo float(b) o tipo double(d)
        float tipoFloat = 5.0f; //su rango de valores es de 1.4x10-45 a 3.4028235x1038
        double tipoDouble = 6.2d; //su rango de valores es de 4.9x10-324 a 1.7976931348623157x10308

        //Texto
        /*--- Carácter ---*/
        char tipoChar = 'a'; //debemos hacerlo con comillas simples

        //Lógicos
        boolean tipoLogico = true; //valor true o 1
        boolean tipoLogico2 = false; //valor false o 0

        /*
        NOTA: ninguno de los tipos de datos anteriores puede ser nulo.
         */
        /* --- Tipos estructurados ---*/

        //Cadena de texto
        String tipoString = "cadena de texto"; //deben estar con doble comillas

        //Array
        String[] tipoArray = new String[8]; //1. forma de crear un array
        String tipoArray2[] = new String[7]; //2. forma de crear un array
        String[][] tipoArray3 = new String[4][2]; //3. forma de crear un array

        /*--- Tipos envoltorio o Wrapper ---*/
        /*
        * NOTA: estos tipos de datos sí pueden contener datos nulos ya que son los equivalente
        * a los datos primitivos pero en forma de objetos
        *
        * NOTA 2: nótese que a algunos datos debemos agregarles una letra al lado
        * para conocer más de estos tipos de datos -> https://www.campusmvp.es/recursos/post/Que-son-los-tipos-por-valor-y-por-referencia-en-NET-y-C.aspx
        * está escrito para C# pero sirve igual para Java
        * */
        Integer tipoInteger = null;
        Long tipoLong2 = 1L;
        Byte tipoByte2 = 2;
        Short tipoShort2 = 3;
        Float tipoFloat2 = 2.5F;
        Double tipoDouble2 = 3.1416D;
        Boolean tipoBoolean = true;
        Character tipoCharacter = 'a';

    }
}
