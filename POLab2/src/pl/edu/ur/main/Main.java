package pl.edu.ur.main;
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner imp = new Scanner(System.in);
        System.out.println("Podaj nr zadania 3,4,6,7");
        int cho = imp.nextInt();
        switch(cho)
        {
            case 3:
                
                double[] arr = new double[10];
                int sel;
                
                for(int i = 0;i<10;i++)
                {
                    System.out.println("Podaj liczbe nr. "+(i+1));
                    arr[i] = imp.nextDouble(); 
                }
                
                while(true)
                {
                
                System.out.println("1) Wyświetlanie tablicy od pierwszego do ostatniego indeksu.\n" +
                                   "2) Wyświetlanie tablicy od ostatniego do pierwszego indeksu.\n" +
                                   "3) Wyświetlanie elementów o nieparzystych indeksach.\n" +
                                   "4) Wyświetlanie elementów o parzystych indeksach.");
                
                sel = imp.nextInt();
                
                if(sel==1)
                {
                    for(int i = 0;i<10;i++)
                    {
                        System.out.println("Indeks nr. "+i+" = "+arr[i]); 
                    }
                }else if(sel==2)
                {
                    for(int i = 9;i>=0;i--)
                    {
                        System.out.println("Indeks nr. "+i+" = "+arr[i]); 
                    }
                }else if(sel==3)
                {
                    for(int i = 0;i<10;i++)
                  {
                     if((i%2)!=0)
                     {
                         System.out.println("Indeks nr. "+i+" = "+arr[i]); 
                     }
                }
                }else if(sel==4)
                {
                    for(int i = 0;i<10;i++)
                {
                    if((i%2)==0)
                     {
                         System.out.println("Indeks nr. "+i+" = "+arr[i]); 
                     }
                }
                }else if(sel<1||sel>4)
                {
                    System.out.println("Niepoprawna wartosc");
                }
                }
                /*Napisz program umożliwiający wprowadzanie 10-ciu liczb rzeczywistych do tablicy. Następnie utwórz następujące funkcjonalności używając pętli `for`:
   
                * Wyświetlanie tablicy od pierwszego do ostatniego indeksu.
                * Wyświetlanie tablicy od ostatniego do pierwszego indeksu.
                * Wyświetlanie elementów o nieparzystych indeksach.
                * Wyświetlanie elementów o parzystych indeksach.

                Wyniki działania algorytmów wyświetlaj na konsoli. Dla wyboru powyższych funkcjonalności programu utwórz odpowiednie menu. Do obsługi menu użyć rozbudowanej konstrukcji `else-if` oraz pętli `do-while`.*/
            case 4:
                
                double[] arx = new double[10];
                double max = 0, min = 0, med = 0, il = 0, sm = 0;
                int six = 0;
                
                for(int i = 0;i<10;i++)
                {
                    System.out.println("Podaj liczbe nr. "+(i+1));
                    arx[i] = imp.nextDouble(); 
                }
                min = arx[0];
                max = arx[0];
                il = 1;
                for(int i = 0;i<10;i++)
                {
                    sm+=arx[i];
                    il=il*arx[i];
                    if(min>arx[i])
                    {
                       min = arx[i];
                    }
                    if(max<arx[i])
                    {
                        max = arx[i];
                    }
                }
                med = sm/10;
                
                
                System.out.println("1) oblicz sumę elementów tablicy,\n" +
                                   "2) oblicz iloczyn elementów tablicy,\n" +
                                   "3) wyznacz wartość średnią,\n" +
                                   "4) wyznacz wartość minimalną,\n" +
                                   "5) wyznacz wartość maksymalną.");

                six = imp.nextInt();
                
                switch(six)
                {
                    case 1:
                        System.out.println("Suma elementów to: "+sm);
                        break;
                    case 2:
                        System.out.println("Iloczyn elementów to: "+il);
                        break;
                    case 3:
                        System.out.println("Srednia elementów to: "+med);
                        break;
                    case 4:
                        System.out.println("Minimalna z elementów to: "+min);
                        break;
                    case 5:
                        System.out.println("Maksymalna z elementów to: "+max);
                        break;
                }
                /*Napisz program umożliwiający wprowadzanie 10-ciu liczb. Dla wprowadzonych liczb wykonaj odpowiednie algorytmy:

                * oblicz sumę elementów tablicy, ok
                * oblicz iloczyn elementów tablicy,
                * wyznacz wartość średnią,
                * wyznacz wartość minimalną,
                * wyznacz wartość maksymalną.

                Wyniki działania algorytmów wyświetlaj na konsoli. Utwórz odpowiednie menu. */
            case 6:
                int xy;
                for(;;)
                {
                    System.out.println("Podaj liczbe calkowita:");
                    xy = imp.nextInt();
                    if(xy<0)
                    {
                        break;
                    }
                }
                /*Napisz program, który w nieskończoność pyta użytkownika o liczby całkowite. Pętla nieskończona powinna się zakończyć gdy użytkownik wprowadzi liczbę mniejszą od zera. Do opuszczenia pętli nieskończonej użyj instrukcji `break`*/
                break;
            case 7:

                System.out.println("Ilosc liczb w tablicy:");
                int quantity = imp.nextInt();
                int temp = 0;
                int ch = 1;
                
                int[] arc = new int[quantity];

                for(int i = 0; i<quantity; i++)
                {
                    System.out.println("Wprowadz liczbe nr. " + (i+1));
                    int digit = imp.nextInt();
                    arc[i] = digit;
                }
                
                while(ch > 0)
                {
                    ch = 0;
                    for(int i=0; i<(quantity-1); i++)
                    {
                        if(arc[i]>arc[i+1])
                        {
                            temp = arc[i+1];
                            arc[i+1] = arc[i];
                            arc[i] = temp;
                            ch++;
                        }
                    }
                }
                
                for(int i = 0;i<quantity;i++)
                {
                    System.out.print(arc[i]+", ");
                }
                /*Napisz program umożliwiający wprowadzanie n liczb oraz sortujący te liczby metodą bąbelkową lub wstawiania. Wyniki wyświetlaj na konsoli*/
                break;
            default:
        }
        // TODO zad 3, 4, 6, 7
    }
    
}
