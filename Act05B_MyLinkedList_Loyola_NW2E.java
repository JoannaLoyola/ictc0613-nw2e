/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package act05b_mylinkedlist_loyola_nw2e;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author LOYOLA
 */
public class Act05B_MyLinkedList_Loyola_NW2E {

    public String firstName, middleName, lastName, areaCode, telNum, Gender, Age;
    public Act05B_MyLinkedList_Loyola_NW2E field;
    public static Act05B_MyLinkedList_Loyola_NW2E firstNode;
    public static Act05B_MyLinkedList_Loyola_NW2E lastNode = null;

    public Act05B_MyLinkedList_Loyola_NW2E(String fName, String mName ,String lName,String aC,String telephone, String gender,
            String age, Act05B_MyLinkedList_Loyola_NW2E f){
       firstName = fName;
       middleName = mName;
       lastName = lName;
       areaCode = aC;
       telNum = telephone;
       Gender = gender;
       Age = age;
       field = f;

    }

    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int mem;
        String node, firstName, middleName, lastName, areaCode, telNum, Gender, age;
        System.out.print("How many members will Join?");
        mem = Integer.parseInt(input.readLine());
        for (int i=0; i<mem; i++){
            System.out.println("\nKindly give the information of the applying member #"+(i+1)+"");
            System.out.print("Enter First Name :");
            firstName = input.readLine();
            System.out.print("Enter middle Name :");
            middleName = input.readLine();
            System.out.print("Enter last Name :");
            lastName = input.readLine();
            System.out.print("Enter Area Code:");
            areaCode = input.readLine();
            System.out.print("Enter Telephone Number :");
            telNum = input.readLine();
            System.out.print("Enter Gender:");
            Gender = input.readLine();
            System.out.print("Enter age :");
            age = input.readLine();

           Act05B_MyLinkedList_Loyola_NW2E n = new Act05B_MyLinkedList_Loyola_NW2E(firstName, middleName, lastName, areaCode, telNum, Gender, age, null);

            if(lastNode!=null){
            lastNode.field = n;
            lastNode = n;
}           else {
            firstNode = n;
            lastNode = n;

        }
        }
        Act05B_MyLinkedList_Loyola_NW2E n=firstNode;
        while(n != null){
        for(int i =0; i<mem; i++ ){
        System.out.println("\nWelcome to the club " +n.firstName+" "+n.middleName+" " +n.lastName+ "!");
        System.out.println("Your area code and telephone number is (" +n.areaCode +") "+ n.telNum+".");
        System.out.println("You are a " +n.Gender+ " member and your age is " +n.Age+ "." );
    n = n.field;
}
}  
}
}

