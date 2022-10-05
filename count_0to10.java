


public class count_0to10 {


    public static void main(String[] args) {

        print010(0);

    

    }

    static int print010(int i){

        if(i==10){
            System.out.println(i);
            return i;
        }
        else{
            System.out.println(i);
            return print010(i++);
        }

    }

    
}