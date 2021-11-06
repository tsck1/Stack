package Stack;

public class Stack <T>{


    private T [] array;

    /* private -> nur inerhalb der Klasse
    pulic -> von überal verwendbar

     */

    private int counter;

    public Stack (T[]array){

        this.array= array;
        counter=0;

    }

    public void push(T value){
        if(counter>=array.length){
            System.out.println("Stack is full");
            return; //verlasse die Methode
        }
        array[counter]=value;
        counter++;
    }

    public T pop(){
        if(counter==0){
         //  return -1;
            return null;
        }
        counter--;
        return array[counter];
    }
}


