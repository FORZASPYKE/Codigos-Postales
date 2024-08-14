package mx.unison;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class EncontrarCodigo {
    public static void main(String[] args) {
        try {
            FileReader ArchivoLectura = new FileReader("codigos_postales.csv");

            BufferedReader ArchivoEscritura = new BufferedReader(ArchivoLectura);
            String almacen, almacen2;

            if(args.length<=0){
                System.out.println("No hay argumentos");
                System.exit(0);
            }else{

                 for (String argumentos : args) {

                    while((almacen = ArchivoEscritura.readLine()) != null) {

                        almacen2 = almacen.substring(0, almacen.indexOf(","));
                        //System.out.println(argumentos);
                        //System.out.println(almacen2);
                        if(argumentos.equals(almacen2)){
                            System.out.println(almacen);
                        }
                    }



                }
            }






        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch(IOException e) {
            throw new RuntimeException();
        }
    }
}
