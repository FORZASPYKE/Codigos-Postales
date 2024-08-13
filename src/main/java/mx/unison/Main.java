package mx.unison;

/* Contar cuantos códigos postales corresponden a asentamientos rurales
y cantos a asentamientos rurales
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try{
        FileReader ArchivoLectura = new FileReader("codigos_postales.csv");

        BufferedReader ArchivoEscritura = new BufferedReader(ArchivoLectura);
        String almacen = null;
        String dif = "Urbano";
        int ContadorU = 0;
        int ContadorR = 0;

        while((almacen=ArchivoEscritura.readLine())!= null){

            //Se almacenan las palabras Urbano o Rural
            almacen= almacen.substring(almacen.lastIndexOf(",")+1);
            //System.out.println(dif);

            //Se compara la palabra almacenada en la variable "almacen" con la palabra almacenada en "diff"
            if(almacen.equals(dif)){
                //Si se cumple la condicion se agrega +1 en el contador de zona Urbana.
                ContadorU++;
            }else{
                //Si no se cumple la condicion, se agrega +1 en el contador de zona Rural.
                ContadorR++;
            }
        }
            //Se muestran en la terminal los resultados
            System.out.println("El numero de zonas Urbanas es: " + ContadorU);
            System.out.println("El numero de zonas Rurales es: " + ContadorR);

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException();
        }
    }
}

//Actualizado