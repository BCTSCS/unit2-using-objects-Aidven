package APCalendar;
public class MethodsLab2{

    public static void main(String[] args){
        forLoop(2,90,5);
        forLoop(-10,8,2);
        forLoop(100,150,5);
        whileLoop(234);
        whileLoop(10000);
        whileLoop(123456789);
        whileLoop(222222);
        addHyphen("Hello World");
        addHyphen("Jim Bob");
        addHyphen("Computer Science");
        addHyphen("UIL TCEA");
        addHyphen("State Champions");
    }

    public static void forLoop(int start, int stop, int increment){
        
        for(int i = start; i<stop; i +=increment){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void whileLoop(int number){
        int total = 0;
        int count = 0;
       while(number>0){
        count++;
        int digit = number%10;
        total+=digit;
        number /= 10;
    }
    System.out.println(count +" digits totaling " + total);
    }

    public static void addHyphen(String string){
        String uString = string.toUpperCase();
        System.out.println(uString);
        String hString = uString.substring(0,uString.indexOf(' ')) + "-" + uString.substring(uString.indexOf(' ')+1);
        System.out.println(hString);
    }
}