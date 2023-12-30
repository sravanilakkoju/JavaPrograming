import java.util.Scanner;

public class newclass {
    public void myClass(String name){
        System.out.println("Iam the first new class");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(s + name);
    }
    public void urClass(){
        System.out.println("this is the second class");
        int[] array = {1,2,3,4};
        for(int i = 0;i< array.length;i++){
            System.out.println(array[i]);
        }

    }
}
