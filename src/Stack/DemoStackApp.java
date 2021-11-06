package Stack;

public class DemoStackApp {

    public static void main(String[] args) {
       // Stack stappel = new Stack(new int[7]);
        Stack /*<String>*/ stappel = new Stack(new Integer[7]); //wrapper klasse

        stappel.push(7);
        stappel.push(5);
        stappel.push(6);


        System.out.println("stappel.pop() ="+ stappel.pop());
        System.out.println("stappel.pop() ="+stappel.pop());
        stappel.push(3);
        System.out.println("stappel.pop() ="+ stappel.pop());
        System.out.println("stappel.pop() ="+ stappel.pop());
        System.out.println("stappel.pop() ="+ stappel.pop());


    }
}
