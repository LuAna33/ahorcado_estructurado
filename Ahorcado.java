
import java.util.Scanner;
public class Ahorcado { 
    final int OPORTUNIDAD = 6;
    public static void main (String [] args) { 
        Scanner reader = new Scanner(System.in); //buffer, entrada teclado//
        int num = 0;
        char palabra[];
        int aciertos= 0;
        char letra;
        char let;
        int oportunidad2 = 6;
        String pantalla="";
        String pantalla2="";
        System.out.println ("--------------------------------------");
        System.out.println ("<<<<<<<¡BIENVENIDO AL AHORCADO!>>>>>>>");
        System.out.println ("--------------------------------------");
        //El Jugador 1 ingresa lacantidad de letras de la palabra a descubrir//
        System.out.println ("Primer jugador...Ingrese el numero de letras que contiene su palabra");
        palabra = new char[num];
        num = reader.nextInt();
        palabra = new char[num];
        
        //Recorre el ingreso de letra a letra que realiza el Usuario 1 para conformar la palabra a descubrir//
        
        for (int i = 0; i < num; i++){
            System.out.println ("Ingresar la Palabra letra por letra.");
            let = reader.next().charAt(0);
            palabra[i] = let;
            pantalla = pantalla + let;
            pantalla2 = pantalla2 + palabra[i];
                        
        }
        System.out.println ("Has ingresado tu palabra exitosamente! La misma es..." + pantalla +" = "+ pantalla2);// Primera etapa del juego concluida (Usuario 1)//
        System.out.println ("-----------------------------------------------------------------------------");
        System.out.println (">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("-----------------------------------------------------------------------------");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println ("-----------------------------------------------------------------------------");
        System.out.println (">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("-----------------------------------------------------------------------------");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println ("-----------------------------------------------------------------------------");
        System.out.println ("------------------------------------------");
        System.out.println ("¡COMIENZA EL JUEGO!¡ES TU TURNO JUGADOR 2!");
        System.out.println ("------------------------------------------");
        System.out.println ("La palabra a descubrir tiene--"+ num +"--letras. Ingresa una a una. ¡Mucha suerte!");//Inicio segunda etapa (Usuario 2)//
          
        // Recorre el numero de letras de la palabra//
        while (oportunidad2 != 0 && aciertos != num) {
            boolean encontrado= false;
            letra = reader.next().charAt(0);
            // Recorre la palabra para verificar si existe coincidencia entre la letra ingresada y las que componen la palabra a descubrir//for (int k = 0;
            for ( int k = 0; k < num; k++){
                              
                if (letra == palabra[k]){
                    System.out.println("¡Excelente!¡Has acertado!");
                    aciertos++;
                    encontrado= true;
                    break;
                }
            }                  
               
                if(!encontrado){
                    oportunidad2 = oportunidad2 - 1;
                    System.out.println ("La letra que has ingresado no forma parte de la palabra a descubrir.");
                    System.out.println ("Te quedan-" + oportunidad2 + "-intentos");
                    
                }
        }   
        
                                    
                if (aciertos == num){
                    System.out.println ("<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");  
                    System.out.println ("¡¡¡FELICITACIONES!!!¡¡¡GANASTE!!!");
                    System.out.println ("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
                    System.out.println ("<<<<<<<"+ pantalla2 + ">>>>>>>>>>");
                    
                } 
                                               
                if(oportunidad2 == 0){
                   System.out.println("--------------------------------------------");
                   System.out.println("¡Fin del Juego! !Puedes volver a intentarlo!");
                   System.out.println("--------------------------------------------");
                   
                }
    }                  
}          



  
        
        
        
        
        
        
        
        