import java.util.*;







public class CoolNumbers {
    public static void main(String[] args) {


    int n,a,b;
    Scanner input = new Scanner(System.in);  
    System.out.println("Which number(positiv integer) should be tested?");
    n = input.nextInt();
    input.nextLine();

    System.out.println("Between which Intervall should the program look for cool numbers?(a,b)\na:");
    a = input.nextInt();
    input.nextLine();
    System.out.println("b:");
    a = input.nextInt();
    input.nextLine();


/* 

    }



    public static boolean isCool(int x, int n) 
    {
        if(n%x!=0)
        return false;
            else 
            return true;
    }


    public static int countCools(int n, int a, int b)
    {
        int Coolnumbers = 0;
        if(a<b)
        {
            while(a<=b)
            {
                if(isCool(a,n)==true)
                {
                    Coolnumbers++;
                }
                a++;
            }
        }
        else if(b<a)
        {
            while(a<=b)
            {
                if(isCool(b,n)==true)
                {
                    Coolnumbers++;
                }
                b++;
            }
        }
        return Coolnumbers;
        

    }
  */  
}

