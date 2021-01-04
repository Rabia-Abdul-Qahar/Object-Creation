/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinfo;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentInfo {
    public static void stars(){
        for(int stt=0;stt<=40;stt++){
        System.out.print("*");}
    }

    public static void main(String[] args) {
           
       ArrayList<String> aa=new ArrayList<>();
       // Save ss=new Save();
        String[] spli = null;
        String[] spli2 = null;
        int count = 0;
        double per;
        int per2;
        Scanner sc=new Scanner(System.in);
       do{ 
           stars();
           System.out.println();
           System.out.println("******** STUDENTS DATA *********");
            System.out.println("1) Enter data of student: ");
            System.out.println("2) Show All the data: ");
            System.out.println("3) NO: of Students entered: ");
            System.out.println("4) How many students pass and fail: ");
            System.out.println("5) Exit:");
            stars();
            System.out.println();
            int in=sc.nextInt();
            System.out.println();
            if(in==1)
            {   stars();
                System.out.println();
                System.out.println("How many student's data you want to enter ");
                stars();
                System.out.println();
                int st=sc.nextInt();
                System.out.println("Format:[name, gender( f,m ), class, age, english marks, urdu marks, science marks]");
                stars();
                System.out.println();
                for(int a=0;a<st;a++)
                {
                    System.out.print(++count +") " );
                     String data=sc.next();
                     //spli=data.split(",");
                    aa.add(data);
                     
                }
                 spli2=spli;
            }
             if(in==2)
                 
             {   System.out.println();
                 stars();
                 System.out.println();
                 System.out.println(" All Data ");
                 stars();
                 for(int i=0;i<aa.size();i++){
                 
                 String data2=aa.get(i);
                 spli2=data2.split(",");
                     System.out.println("\n");
                 System.out.println("Name: "+ spli2[0]);
                 if(spli2[1]=="m"){System.out.println("Gender: MALE");}
                 if(spli2[1]=="f"){System.out.println("Gender: FEMALE");}
                 System.out.println("Class: "+spli2[2]);
                 System.out.println("Age: "+spli2[3]);
                 System.out.println("English Marks: "+spli2[4]);
                 System.out.println("Urdu Marks: "+spli2[5]);
                 System.out.println("Science Marks: "+spli2[6]);
                   double a1=Double.parseDouble(spli2[4]);
                 double a2=Integer.parseInt(spli2[5]);
                double a3=Integer.parseInt(spli2[6]);
                 per=(((a1+a2+a3)/300)*100);
                 per2=(int)per;
                 System.out.println("Remarks: "+spli2[0]+" has secured "+per2 +"% marks" );
                 
                 
             }
                 System.out.println("\n");
                 
             }
             if(in==3){
                 stars();
                 System.out.println();
                 System.out.println("Total Students: "+count);
             }
             if(in==4){
                 int fail=0;
                 int pass=0;
                 stars();
                 System.out.println();
                 for(int c=0;c<aa.size();c++){
                     String data3=aa.get(c);
                 String[] spli3=data3.split(",");
                 double a1=Double.parseDouble(spli3[4]);
                 double a2=Integer.parseInt(spli3[5]);
                double a3=Integer.parseInt(spli3[6]);
                 per=(((a1+a2+a3)/300)*100);
                 if(per<50.0){
                     ++fail;
                 }
                 else 
                     if(per>=50.0){
                     ++pass;
                 }
                  
                 }stars();
                 System.out.println();
                  System.out.println("Pass: "+pass+"  Fail: "+fail);
             }
             if(in==5){
                 System.exit(0);
             }
             
            }while (true);
            
                  
            
    
    
}}

