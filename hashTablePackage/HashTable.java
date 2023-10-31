package hashTablePackage;

import java.util.Scanner;

public class HashTable {
    public HashTable(){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Hash Table \n\n");
            Thread.sleep(2000);
            System.out.println("Enter Size : ");
            LinearProbing lp = new LinearProbing(s.nextInt());

            char ch;
            do
            {
                lp.clearConsole();
                System.out.println("\nHash Table Operations\n");
                System.out.println("1. insert ");
                System.out.println("2. remove");
                System.out.println("3. get");
                System.out.println("4. clear");
                System.out.println("5. size");
                System.out.println("6. print table");
                int choice = s.nextInt();
                switch (choice) {
                case 1:
                    System.out.println("Enter key and value");
                    lp.insert(s.next(), s.next());
                    break;
                
                case 2:
                    System.out.println("Enter key");
                    lp.remove(s.next());
                    break;
                
                case 3:
                    System.out.println("Enter key");
                    System.out.println("Value = "+ lp.get(s.next()));
                    break;
                
                case 4:
                    lp.makeEmpty();
                    System.out.println("Hash Table Cleared\n");
                    break;
                
                case 5:
                    System.out.println("Size = "+ lp.getSize());
                    break;
                case 6:
                    System.out.flush();
                    System.out.println("Printing HashTable");
                    lp.printHashTable();
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
                }
            

                System.out.println("\nDo you want to continue (Type y or n) \n");
            
                ch = s.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

        s.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        

    }
   

    
}

    

