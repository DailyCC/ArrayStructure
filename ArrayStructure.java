import java.util.*;

/*
What's the code for?
- INSERTING, SEARCHING AND DELETING VALUE FROM AN ARRAY 

*/

public class ArrayStructure{

    private int[] theArray = new int[50];
    private int arraySize = 10;

    private void generateRandomArray(){

        for(int i = 0; i < arraySize; i++){

            theArray[i] = (int)(Math.random()*10)+10;           // RANDOM NUMBER IS IN THE RANGE OF 20
        }
    }

    
    // function use to print the array
    public void printArray(){

        System.out.println("address : " + theArray);            // this is printing the address of variable (theArray)

        System.out.println("===========");
        for(int i = 0; i < arraySize; i++){

            System.out.println("INDEX: " + i);                  // this is printing the i -> counter
            
            System.out.println("VALUE: " + theArray[i]);        // this is printing the actual value inside that each indexes

        System.out.println("===========");
        }
    }

    // function that find value given an index
    public int getValueAtIndex(int index){

        if(index < arraySize)           // if index given is lesss than arraySize 
            return theArray[index];     // return the value inside that index
        else                            // else
            return 0;                   // return 0 -> false
    }

    // is this value in the array

    public boolean doesThisArrayContainThisValue(int value){
        
        boolean valueInArray = false;           // set valueInArray to false

        for(int i = 0; i < arraySize; i++){     // loop through the array 

            if (theArray[i] == value){          // while looping the array if, one of the value inside the array equal value give in the parameter

                valueInArray = true;            // change the variable valueInArray to true 

            }
        }

        return valueInArray;
    }

    public void deleteIndex(int index){

        if(index < arraySize)
            for (int i = 0; i < (arraySize - 1); i++){

                theArray[i] = theArray[i + 1];
            }

            arraySize--;
    }

    public void insertValue(int value){

        if(arraySize < 50){

            theArray[arraySize] = value;

            arraySize++;
        } 

    }

    public static void main(String[] args){

        ArrayStructure newArray = new ArrayStructure();         // creating a new array 

        newArray.generateRandomArray();                         // calling function using the array

        newArray.printArray();                                  // printing the array 

        System.out.println(newArray.getValueAtIndex(9));

        System.out.println(newArray.doesThisArrayContainThisValue(20));

        newArray.deleteIndex(4);                               // removing index 4 and moves up the index below it to its position
        
        System.out.println("----------------");
        System.out.println("    NEW ARRAY   ");
        System.out.println("----------------");

        newArray.printArray();            
        
        newArray.insertValue(10);                               // inserting the value 10 at the end of the array 

        System.out.println("----------------");
        System.out.println("    NEW ARRAY   ");
        System.out.println("----------------");

        newArray.printArray();
    }
}
