import java.util.Scanner;




public class CoolNumbers {
    public static void main(String[] args) {

    int n,a,b;
    Scanner input = new Scanner(System.in);  
    System.out.println("Which number n(positiv integer)should be tested?");
    n = input.nextInt();
    input.nextLine();

    System.out.println("Between which Intervall should the program look for cool numbers?(a,b)\na:");
    a = input.nextInt();
    input.nextLine();

    System.out.println("b:");
    b = input.nextInt();
    input.nextLine();

    System.out.println("There are "+countCools(n, a, b)+" for "+n+ " between the Interval("+a+","+b+")");

    }  
    public static boolean isCool(int x, int n) 
    {
        int length = String.valueOf(x).length(); //evaluation length of the string to know how many digits the integer has
        boolean cold = true;

        int i = 0;
        while((cold)&&(i<length))   //while loop goes through the digits as long as the number is still cold
        {   
            if(Character.getNumericValue(String.valueOf(x).charAt(i))==0) //digit zero or not? 
            {
                cold = false; //break out of while lopp if digit is zero
                
            }
            else if((n%Character.getNumericValue(String.valueOf(x).charAt(i))==0)) // looking whtether n is modulo without rest by the digit
            {
                cold = true;
            }
            else{ //digit is not modulo
                cold=false; 
            } 
            i++;
        
        }
        return cold;
    }  
    public static int countCools(int n, int a, int b)
    {
        int Coolnumbers = 0; //counter for cool numbers
        if(a<=b) //looks whehther the interval bounderies are set in the right order
        {
            while(a<=b)
            {
                if(isCool(a,n)) //if number is cool, counter Coolnumbers counts up
                {
                    Coolnumbers++;
                }
                a++; //counter to iterate through the hole interval
            }   
        }
        else if(b<=a) ////looks whehther the interval bounderies are set in the right order
        {
            while(a<=b)
            {
                if(isCool(b,n))
                {
                    Coolnumbers++;
                }
                b++;
            }
        }
        return Coolnumbers;
    }
}


