import java.util.Scanner;
public class Practice{
    public static void main(String[] args){
        System.out.println("Hello, World!");

        //calling te new class into te main class as an object...
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        newclass newClassObject = new newclass();
        newClassObject.myClass(name);

        //calling the second new class imto the main class as anobject...
        newclass newClassObject1 = new newclass();
        newClassObject1.urClass();

    }
}
