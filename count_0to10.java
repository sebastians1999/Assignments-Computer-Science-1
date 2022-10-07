


public class count_0to10 {


    public static void main(String[] args) {

        int i=0;
        print010(i);

    

    }

    static int print010(int i){

        if(i==10){
            System.out.println(i);
            return i;
        }
        else{
            System.out.println(i);
            return print010(++i);
        }

    }

    
}