package Practice;

import java.util.ArrayList;

public class customerFactFindDO {
 String cffSeq;
 String firstName;
 String genderCd;
 private ArrayList<cffFamilyDetailsDO> Family;
public String getCffSeq() {
	return cffSeq;
}
public void setCffSeq(String cffSeq) {
	this.cffSeq = cffSeq;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getGenderCd() {
	return genderCd;
}
public void setGenderCd(String genderCd) {
	this.genderCd = genderCd;
}

public ArrayList<cffFamilyDetailsDO> getFamily() {
	return Family;
}
public void setFamily(ArrayList<cffFamilyDetailsDO> family) {
	Family = family;
}
//@Override
//public String toString() {
//	return "customerFactFindDO [cffSeq=" + cffSeq + ", firstName=" + firstName
//			+ ", genderCd=" + genderCd + "]";
//}
@Override
public String toString() {
	return "customerFactFindDO [cffSeq=" + cffSeq + ", firstName=" + firstName
			+ ", genderCd=" + genderCd + ", Family=" + Family + "]";
}
 
 
}
