package FizzBuzz;
import java.io.*;
public class Main {

    public static void main(String[] args)
    throws IOException
    {

    int ilosc;
        System.out.println("FIZZBUZZ :)");
        System.out.println();
        // PENTLA
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj liczbe i zagramy:");
        ilosc = Integer.parseInt(br.readLine());

       for(int a =1; a<=ilosc;a++){
           if(a % 3 ==0){
               if(a % 5 == 0)
               {
                   System.out.println("FizzBuzz");
               }else{
                   System.out.println("Fizz");
               }

           }else if (a % 5 == 0)
           {
               System.out.println("Buzz");
           }else{
               System.out.println(a);
           }
       }

        // TABLICA
/*
        for (int i = 1; i <= ilosc; i++) {
            String[] FB = new String[]{i + "", "Fizz", "Buzz", "FizzBuzz"};
            int index = (i % 3 == 0 ? 1 : 0) + (i % 5 == 0 ? 2 : 0);

            System.out.println(FB[index]);
        }
*/

    }
}
