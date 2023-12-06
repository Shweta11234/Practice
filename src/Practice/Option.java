package Practice;

import java.util.HashMap;
import java.util.Scanner;



public class Option {
   methods m = new methods();
    HashMap<String,customerFactFindDO>partyMap = new HashMap<String,customerFactFindDO>();
   public void console(){
   Scanner sc = new Scanner(System.in);
   while(true){
	   System.out.println("---------Menu-----------");
	   System.out.println("This is change done by other Developer");
	   System.out.println("This is change done by shweta");
	   
	   System.out.println("1.Register Party");
	   System.out.println("2.Display Party using partyseq");
	   
	   System.out.println("3.Delete Party ");
	   System.out.println("4.Update Party ");
	   System.out.println("5.get gender by using full name");
	   System.out.println("6.get count of nominee");
	   System.out.println("Enter Your Choice");
	   int ch = sc.nextInt();
	   switch(ch){
	   case 1:
		   customerFactFindDO CFFD = new customerFactFindDO();
		   /*customerFactFindDO cffd1 =*/
				   m.register(CFFD);
				   partyMap.put(CFFD.getCffSeq(),CFFD);
		   break;
	   case 2:
		   System.out.println("enter cffSeq sequence:- ");
		   String cffSeq = sc.next();
		   m.display(cffSeq, partyMap);
      break;
	   case 3:
		   System.out.println("enter cffSeq :- ");
		   String cffSeq1 =sc.next();
		   m.remove(cffSeq1,partyMap);
		   break;
	   case 4:
		   System.out.println("enter cffSeq:- ");
		   String cffSeq2 = sc.next();
		   m.Update(cffSeq2,partyMap);
		   break;
	   case 5:
		   System.out.println("enter cffseq name");
		  // String cffseq3 = sc.next();
		   
		   m.get(partyMap);
		   break;
	   case 6:
		   System.out.println("enter cffseq name");
		   String cffseq4 = sc.next();
		   
		   m.count(cffseq4,partyMap);
		   break;
	   }
	  
	   }
  
   
   
   
   
   }
}

