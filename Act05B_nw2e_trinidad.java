package act05b_nw2e_trinidad;

import java.util.*;

public class Act05B_nw2e_trinidad {

    
    public String fname,mname,lname,areacode,telnumber,gender;
    public int age;
    public Act05B_nw2e_trinidad next;
    public static Act05B_nw2e_trinidad FirstNode;
    public static Act05B_nw2e_trinidad LastNode = null;
    
    public  Act05B_nw2e_trinidad  (String fName,String mName,String lName,String Areacode,String tnum,String Gender,int Age, Act05B_nw2e_trinidad  n){
      fname = fName;
      mname = mName;
      lname = lName;
      areacode = Areacode;
      telnumber = tnum;
      gender = Gender;
      age = Age;
      next = n;
    }
    
    public static void main(String[] args) {
       
       int Nodes;
        Scanner input = new Scanner(System.in);
        System.out.print("How many members’ information will be entered? ");
        Nodes = input.nextInt();
        for(int i = 0; i < Nodes; i++){
            System.out.println("\nKindly give the information of member #" + (i+1));
            UserInformation();
        }
             Act05B_nw2e_trinidad  n = FirstNode;
            
            while(n != null){
                System.out.println("\nWelcome to the Club " + n.fname + " " + n.mname + " " + n.lname + "!");
                System.out.println("Your AreaCode and Telephone Number is (" + n.areacode + ")" + n.telnumber + ".");
                System.out.println("You are a " + n.gender + " member, and your Age is " + n.age + ".");
                n = n.next;
                
            }

}

   static void UserInformation()
{
         Scanner scan = new Scanner(System.in);
         
         String FirtsName, MiddleName, LastName, AreaCode, TelNum, Gender;
         int  Age;
     
            System.out.print("Enter the First Name: ");
            FirtsName = scan.nextLine();
            System.out.print("Enter the Middle Name: ");
            MiddleName = scan.nextLine();
            System.out.print("Enter the Last Name: ");
            LastName = scan.nextLine();
            System.out.print("Enter the AreaCode: ");
            AreaCode = scan.nextLine();
            System.out.print("Enter the Telephone Number: ");           
            TelNum = scan.nextLine();
            System.out.print("Enter the Gender: ");
            Gender = scan.nextLine();
            System.out.print("Enter the Age: ");
            Age = scan.nextInt();

   Act05B_nw2e_trinidad  n = new  Act05B_nw2e_trinidad (FirtsName, MiddleName, LastName, AreaCode, TelNum, Gender, Age, null);
            if(LastNode !=null){
                LastNode.next = n;
                LastNode = n;
            }
            else {
                FirstNode = n;
                LastNode = n;
            }
        }
}