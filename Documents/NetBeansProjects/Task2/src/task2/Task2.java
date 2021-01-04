/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.util.Scanner;

public class Task2 
{   
    
    
    public static void stars()
    {
        for(int a=1;a<=40;a++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args)
{
    Task2[] obj = null;
    int no=0;
     Scanner sc=new Scanner(System.in);
 
    System.out.println();
    stars();
    System.out.println("******** WELCOME **********");
    
    do{
    
    stars(); 
    System.out.println("Press 1 to make object: ");
    System.out.println("Press 2 for memory allocation of objects: ");
    System.out.println("Press 3 for Exit: ");
    stars();
    int input=sc.nextInt();
    
    switch(input)
    {
        case 1: {   stars();
                    System.out.println("How many objects you want to create: ");
                    stars();
                    no=sc.nextInt();
                    obj=new Task2[no];
                    for(int num=0;num<no;num++){
                    
                        obj[num]=new Task2();}
                    System.out.println("Object created!!..");
                    break;
                }
            
        case 2: {   stars();
                    System.out.println("Object's Allocation: ");
                    stars();
                    int it=1;
                    for(int i=0;i<no;i++)
                    {
                        System.out.println(it++ +") "+ obj[i]);
                    }
                    break;
                }

        case 3: {   stars();
                    System.exit(0);
                    break;
                }    
       
        default:{   stars();
                    System.out.println("Wrong choice");
                    stars();
                    break;
                }
    }
    }while(true);
}
}