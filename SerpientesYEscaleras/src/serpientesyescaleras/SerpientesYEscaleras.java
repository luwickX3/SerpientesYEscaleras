package serpientesyescaleras;
import java.util.Scanner;
import java.util.Random;
public class SerpientesYEscaleras 
{

    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        Random Rand = new Random();
        int tablero[] = new int[72];
        int intento = 0;
        int turno = 0;
        int Casilla;
        int i;
        int j;
        String lanzamiento;
        int distancia[] = new int [2];
        for(i = 0; i<10;i++)
        {
            System.out.println("lanzar dado?s/n");
            lanzamiento = Scan.next().substring(0);
            if("s".equals(lanzamiento))
            {
                intento = intento+1;
                System.out.println("intento numero :"+intento);
                if(turno == 0)
                {
                    Casilla = Rand.nextInt(6)+1;
                    tablero[(Casilla)] = 1;
                    switch (Casilla) {
                        case 58:
                            tablero[Casilla]=0;
                            tablero[69] = 1;
                            break;
                        case 21:
                            tablero[Casilla]=0;
                            tablero[2] = 1;
                            break;
                        case 60:
                            tablero[Casilla] = 0;
                            tablero[71] = 1;
                            System.out.print("el jugador 1 gana!");
                            System.exit(0);
                        case 11:
                            tablero[Casilla] = 0;
                            tablero[49] = 1;
                            break;
                        case 18:
                            tablero[Casilla] = 0;
                            tablero[0] = 1;
                            break;
                        case 32:
                            tablero[Casilla] = 0;
                            tablero[20] = 1;
                            break;
                        default:
                            break;
                    }
                    turno = 1;
                }
                else if(turno == 1)
                {
                    Casilla = Rand.nextInt(6)+1;
                    tablero[(Casilla)] = 2;
                    switch (Casilla) {
                        case 58:
                            tablero[Casilla]=0;
                            tablero[69] = 2;
                            break;
                        case 21:
                            tablero[Casilla]=0;
                            tablero[2] = 2;
                            break;
                        case 60:
                            tablero[Casilla] = 0;
                            tablero[71] = 2;
                            System.out.print("el jugador 2 gana!");
                            System.exit(0);
                        case 11:
                            tablero[Casilla] = 0;
                            tablero[49] = 2;
                            break;
                        case 18:
                            tablero[Casilla] = 0;
                            tablero[0] = 2;
                            break;
                        case 32:
                            tablero[Casilla] = 0;
                            tablero[20] = 2;
                            break;
                        default:
                            break;
                    }
                    turno = 0;
                }
            }
            else if ("n".equals(lanzamiento))
            {
                if(intento == 0)
                    {
                        System.out.print("empate!");
                        System.exit(0);
                    }
                j = 71;
                while (tablero[j]!=1)
                {
                    distancia[0] = distancia[0]+1;
                    j = j-1;
                }
                j = 71;
                while(tablero[j]!=2)
                {
                    distancia[1] = distancia [1]+1;
                    j = j-1;
                }
                if(i < 10)
                {
                    if(distancia[0]>distancia[1])
                    {
                        System.out.print("el jugador 1 gana!");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.print("el jugador 2 gana!");
                        System.exit(0);
                    }
                }
            }
        }
        i = 71;
        while (tablero[i]!=1)
        {
            distancia[0] = distancia[0]+1;
            i = i-1;
        }
        i = 71;
        while(tablero[i]!=2)
        {
            distancia[1] = distancia [1]+1;
            i = i-1;
        }
        if(distancia[0]>distancia[1])
            {
                System.out.print("el jugador 1 gana!");
                System.exit(0);
            }
            else
            {
                System.out.print("el jugador 2 gana!");
                System.exit(0);
            }
    }
    
}
