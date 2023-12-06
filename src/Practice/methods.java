package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;



public class methods {
	
	public void register(customerFactFindDO cf){
		//customerFactFindDO cf = new customerFactFindDO(); 
		 Scanner sc = new Scanner (System.in);
		 System.out.println("plaease enter cffSeq");
		 cf.setCffSeq(sc.next());
		 System.out.println("Please enter your FisrtName");
		String FN = sc.next();
		 cf.setFirstName(FN);
		 System.out.println("Please enter your gender");
		 System.out.println("Press 1. male 2. female");
		 int ch = sc.nextInt();
		 if (ch==1){
			 cf.setGenderCd("male");
		 }else{
			cf.setGenderCd("female");
		 }
		 
		 
	ArrayList<cffFamilyDetailsDO> Family = new ArrayList<cffFamilyDetailsDO> ();
	 while (true){
	cffFamilyDetailsDO cfamily = new cffFamilyDetailsDO(); 
	Scanner sc3 = new Scanner(System.in);
	  System.out.println("Enter fullname");
	 cfamily.setFullName(sc3.next());
	 
	 cfamily.setCffSeq(cf.getCffSeq());
	 
	 System.out.println("enter relationshipWithProposer");
	 System.out.println("1.Mother ; 2.Father ; 3.Wife");
	 Scanner sc1 = new Scanner(System.in);
	 int ch1 = sc1.nextInt();
	 	 if(ch1 == 1 ){
	 cfamily.setRelationshipWithProposer("Mother");
	 }else if (ch1 == 2){
		 cfamily.setRelationshipWithProposer("Father");
		 
	 }
	 else if(ch1 ==3){
		 cfamily.setRelationshipWithProposer("Wife");
	 }
	 else{
		 System.out.println("enter correct option");
	 }
	 	
	 
	while (true){
		System.out.println("Enter nominee ");
		System.out.println("1.Mother ;2.Father ;3.Wife");
		
		int ch2=sc.nextInt();
		if(ch2==1){
			cfamily.setNominee("Mother");
		}
		else if(ch2 == 2){
			cfamily.setNominee("Father");
		}
		else if(ch2 == 3){
			cfamily.setNominee("Wife");
		}
		else {
			System.out.println("please enter correct nomiee");
		}
		
		Family.add(cfamily);
		break;
		
	}
     
       System.out.println("Do you want to add another family details (1. Yes; 2. No)");
       int choice = sc.nextInt();
       if (choice == 1){
       	continue;
       }else if (choice ==2){
       	break;
       }else{
       	System.out.println("Invalid Entry");
       }
       break;
	}
	 
	 cf.setFamily(Family);
	// return cf;
	 //System.out.println(cf);
	}
  
	public void display(String cffSeq,HashMap<String,customerFactFindDO>partyMap){
//		System.out.println("enter cffSeq");
//		Scanner sc = new Scanner (System.in);
//		 String usercffseq = sc.next();
//		 customerFactFindDO co = partyMap.get(cffSeq);
	for(Map.Entry<String,customerFactFindDO> ab : partyMap.entrySet()){
		if(ab.getKey().equals(cffSeq)){
			System.out.println(ab.getValue());
//			partyMap.remove(cffSeq);
			break;
		}
		else {
			System.out.println("Party NOT Found");
		}
		 
	}
	 }
	public void remove(String cffSeq,HashMap<String,customerFactFindDO>partyMap){
		for(Map.Entry<String,customerFactFindDO> AB : partyMap.entrySet()){
			if(AB.getKey().equals(cffSeq)){
				partyMap.remove(cffSeq);
				System.out.println("Party deleted...");
				break;
			}
			else{
				System.out.println("Party Not Found");
			}
		}
	}
	public void Update(String cffSeq,HashMap<String,customerFactFindDO>partyMap){
		Scanner sc4 = new Scanner (System.in);
		customerFactFindDO cfd = partyMap.get(cffSeq);
		ArrayList<cffFamilyDetailsDO> fam = cfd.getFamily();
	   while(true){
		   if(cfd !=null){
			   System.out.println("1.update first name ; 2.update full name ; 3.update nominee ; 4.update relationship ");
			   int ch2 = sc4.nextInt();
			   switch(ch2){
			   case 1 :
				   System.out.println("update first name");
				   cfd.setFirstName(sc4.next());
				   break;
			   case 2:
				   System.out.println("update full name");
				   for(cffFamilyDetailsDO aa :fam){
					   
					   System.out.println("enter cffSeq");
					   
					   String cffsequpdate = sc4.next();
					   System.out.println("enter full name:- ");
					   if(aa.cffSeq.equals(cffsequpdate)){
						  aa.setFullName(sc4.next());
						  System.out.println("full name updated");
						  break;
					   }else{
						   System.out.println("fullname not updated");
					   }
				   }
			   case 3:
				   System.out.println("update nominee:-");
				   for(cffFamilyDetailsDO aa :fam){
					   System.out.println("enter cffseq:- ");
					   String cffsequpdate= sc4.next();
					   System.out.println("enter updated nomiee name:-");
					   if(aa.getCffSeq().equals(cffsequpdate)){
						   aa.setNominee(sc4.next());
						   System.out.println("nominee updated");
						   break;
					   }else{
						   System.out.println("nomiee not updated");
					   }
				   }
				   System.out.println("Do you want to update (1. Yes; 2. No)");
	      	         int updaterec2 = sc4.nextInt();
	      	         if ( updaterec2 == 1){
	      	         	continue;
	      	         }else if ( updaterec2 ==2){
	      	         	break;
	      	         }else{
	      	         	System.out.println("Invalid Entry");
	      			}
			   }break;
		   }break;
	   }
	}
	public void get(HashMap<String,customerFactFindDO>partyMap){
		Scanner sc5 = new Scanner (System.in);
//		customerFactFindDO cfd = partyMap.get(cffSeq);
//		ArrayList<cffFamilyDetailsDO> fam1 = cfd.getFamily();
//		//System.out.println("Enter full name:-");
//	for(cffFamilyDetailsDO ba :fam1){
//		System.out.println("enter full name");
//		String fullname = sc5.next();
//		if(ba.getFullName().equals(fullname)){
//			System.out.println(cfd.getGenderCd());
//			break;
//		}else{
//			System.out.println("wrong");
//		}
//	}
		System.out.println("enter full name");
		String fullName =sc5.next();
		for(Entry<String, customerFactFindDO> aa :partyMap.entrySet()){
			for(cffFamilyDetailsDO sdd : aa.getValue().getFamily()){
				if(sdd.getFullName().equals(fullName)){
					System.out.println(aa.getValue().getGenderCd());
				}
			}
		}
	}
	public void count(String cffSeq,HashMap<String,customerFactFindDO>partyMap){
		Scanner sc6=new Scanner (System.in);
		customerFactFindDO CFF = partyMap.get(cffSeq);
		ArrayList<cffFamilyDetailsDO> FAM2 = CFF.getFamily();
		int aa = FAM2.size();
		
		System.out.println(aa);
		
	}
}

 
