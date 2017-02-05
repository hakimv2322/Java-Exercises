// The Simpletron.

import java.util.Scanner;
public class ch7Problem35{
    
    final public static int MEMORY_SPACE = 100;
    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        final int READ = 10, WRITE = 11;
        final int LOAD = 20, STORE = 21;
        final int ADD=30,SUBTRACT=31,DIVIDE=32,MULTIPLY=33;
        final int BRANCH=40,BRANCHNEG=41,BRANCHZERO=42,HALT=43;
        
        System.out.println(
                "*** Welcome to Simpletron! ***");
        System.out.println(
                "*** Please enter your program one instruction  ***");
        System.out.println(
                "*** (or data word) at a time into the input    ***");
        System.out.println(
                "*** text field. I will display the location    ***");
        System.out.println(
                "*** number and a question mark (?). You then   ***");
        System.out.println(
                "*** type the word for that location. Press the ***");
        System.out.println(
                "*** Done button to stop entering your program. ***");
        
        int memory[] = new int[MEMORY_SPACE];
        
        for(int i=0; i<(memory.length); i++){
            if(i<10){
                System.out.printf("0%d ? ", i);
                memory[i] = input.nextInt();
            }
            
            if(i>=10){
                System.out.printf("%d ? ", i);
                memory[i] = input.nextInt();
            }
            
            if(memory[i] == -99999){
                memory[i] = 0;
                break;
            }
            
            if(((memory[i] < -9999) || (memory[i] > 9999))){
                memory[i] = 0;
                    i--;
                System.out.println(
                        "Not in the range between -9999 and +9999.");
                System.out.println(
                        "Could you retype that last one? Thanks.");
            }
        }
        
        System.out.println();
        System.out.println(
                "*** Program loading completed ***");
        System.out.println(
                "*** Program execution begins  ***");
        System.out.println();
        
        int operation=0,operand,accumulator=0;
        
        for(int i=0; i<(memory.length); i++){
            
            if(operation == -99999){
                System.out.println(
                        "You have made an emergency program exit.");
                break;
            }
            
            operation = memory[i]/MEMORY_SPACE;
            operand = memory[i]%MEMORY_SPACE;
            
            switch(operation){
                case READ:
                    System.out.println("Enter an integer.");
                    memory[operand] = input.nextInt();
                    operation = memory[operand];
                    break;
                case WRITE:
                    System.out.println("Result:");
                    System.out.println(memory[operand]);
                    break;
                case LOAD:
                    accumulator = memory[operand];
                    break;
                case STORE:
                    memory[operand] = accumulator;
                    break;
                case ADD:
                    accumulator += memory[operand];
                    break;
                case SUBTRACT:
                    accumulator -= memory[operand];
                    break;
                case DIVIDE:
                    accumulator /= memory[operand];
                    break;
                case MULTIPLY:
                    accumulator *= memory[operand];
                    break;
                case BRANCH:
                    i = (operand - 1);
                    break;
                case BRANCHNEG:
                    if(accumulator < 0){
                        i = (operand - 1);
                    }
                    break;
                case BRANCHZERO:
                    if(accumulator == 0){
                        i = (operand - 1);
                    }
                    break;
                case HALT:
                    System.out.println(
                            "*** Simpletron execution terminated ***");
                    i = ((memory.length) - 1);
                    break;
                default:
                    System.out.println(
                            "We have encountered an undefined instruction.");
                    System.out.println(
                            "The program has been terminated.");
                    i = ((memory.length) - 1);
                    break;
            }
            
        }
        System.out.println();
        dump(memory);
        System.out.println();
        
    }
    
    public static void dump( int[] display ){
        
        int a,b,c,d;
        
        System.out.println("MEMORY:");
        System.out.print("  ");
        for(int i=0; i<10; i++){
            System.out.printf("     %d",i);
        }
        System.out.println();
        for(int i=0; i<10; i++){
            if(i == 0){
                System.out.print(" ");
            }
            System.out.print(10*i);
            
            for(int j=0; j<10; j++){
                
                d = display[10*i + j]%10;
                c = ((display[10*i + j]%100) - d)/10;
                b = ((display[10*i + j]%1000) - (10*c) - d)/100;
                a = ((display[10*i + j]%10000) - (100*b) - (10*c) - d)/1000;
                
                if(display[10*i + j] >= 0){
                    if(a != 0){
                        System.out.printf(" +%d", display[10*i + j]);
                    }
                    if((a == 0)&&(b != 0)){
                        System.out.printf(" +0%d", display[10*i + j]);
                    }
                    if((a == 0)&&(b == 0)&&(c != 0)){
                        System.out.printf(" +00%d", display[10*i + j]);
                    }
                    if((a == 0)&&(b == 0)&&(c == 0)&&(d != 0)){
                        System.out.printf(" +000%d", display[10*i + j]);
                    }
                    if(display[10*i + j] == 0){
                        System.out.print(" +0000");
                    }
                
                }
                if(display[10*i + j] < 0){
                    display[10*i + j] = -(display[10*i + j]);
                    if(a != 0){
                        System.out.printf(" -%d", display[10*i + j]);
                    }
                    if((a == 0)&&(b != 0)){
                        System.out.printf(" -0%d", display[10*i + j]);
                    }
                    if((a == 0)&&(b == 0)&&(c != 0)){
                        System.out.printf(" -00%d", display[10*i + j]);
                    }
                    if((a == 0)&&(b == 0)&&(c == 0)&&(d != 0)){
                        System.out.printf(" -000%d", display[10*i + j]);
                    }
                    display[10*i + j] = -(display[10*i + j]);
                    
                }
            }
            System.out.println();
        }
        
    }
}