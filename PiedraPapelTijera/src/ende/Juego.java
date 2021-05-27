package ende;

/**
 * @author Irune Arratibel
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego 
{
    public static void main(String args[])
    {
    	//Atributos
    	//Constantes
    	String GANA1 = "Jugador 1 GANA";
    	String GANA2 = "Jugador 2 GANA";
    	String PAPEL = "papel";
    	String PIEDRA = "piedra";
    	String TIJERA = "tijeras";
    	//Variables
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean finDeJuego = false;  
        Integer Rondasjugadas = 0;    // Numero de rondas jugadas
        Integer exitosJugador1 = p1.getExitos();
        Integer exitosJugador2 = p2.getExitos();
        Integer empates = 0;
       
        
        
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + Rondasjugadas+" *********************\n");
            System.out.println("Numero de empates: "+ empates + "\n");
            String opcionJugador1 = p1.opcionAlAzar();
            System.out.println("Jugador 1: " + opcionJugador1+"\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
            String opcionJugador2 = p2.opcionAlAzar();
            System.out.println("Jugador 2: " + opcionJugador2+"\t Jugador 2 - Partidas ganadas: " + exitosJugador2);
            
            if((opcionJugador1.equals("piedra")) && (opcionJugador2.equals(PAPEL)))
            {
                System.out.println(GANA2);
                exitosJugador2 += p2.getExitos();
                
            }
            else if((opcionJugador1.equals(PAPEL)) && (opcionJugador2.equals(PIEDRA)))
            {
            	exitosJugador1 += p1.getExitos();
                System.out.println(GANA1);
            }
            else if((opcionJugador1.equals(PIEDRA)) && (opcionJugador2.equals(TIJERA)))
            {
            	exitosJugador1 += p1.getExitos();
                System.out.println(GANA1);
            }
            else if((opcionJugador1.equals(TIJERA)) && (opcionJugador2.equals(PIEDRA)))
            {
            	exitosJugador2 += p2.getExitos();
                System.out.println(GANA2);
            }
            else if((opcionJugador1.equals(TIJERA)) && (opcionJugador2.equals(PAPEL)))
            {
            	exitosJugador1 += p1.getExitos();
                System.out.println(GANA1);
            }
            else if((opcionJugador1.equals(PAPEL)) && (opcionJugador2.equals(TIJERA)))
            {
            	exitosJugador2 += p2.getExitos();
                System.out.println(GANA2);
            }
            if(opcionJugador1 == opcionJugador2)
            {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            Rondasjugadas++;
            if((p1.getExitos() >= 3) || (p2.getExitos() >= 3))
            {
            	finDeJuego = true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(finDeJuego != true);
    }
}
/**
 *
 */
class Jugador{
   
	int exitos; 
	
    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcionAlAzar()
    {
        String opcion =  "";
        Integer c = (int)(Math.random() * 3);
        switch(c){
            case 0:
            	opcion = ("piedra");
                break;
            case 1:
            	opcion = ("papel");
                break;
            case 2:
            	opcion = ("tijeras");
        }
        return opcion;
    }
    public void setExitos() 
    {
        exitos++;
    }
    public int getExitos() 
    {
        return(exitos);
    }
    
    
}
