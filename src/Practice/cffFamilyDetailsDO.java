package Practice;

public class cffFamilyDetailsDO {
	
  // String CffFamilyDetailsDO;
    String cffSeq;
    String fullName;
    String relationshipWithProposer;
    String Nominee;
//	public String getCffFamilyDetailsDO() {
//		return CffFamilyDetailsDO;
//	}
//	public void setCffFamilyDetailsDO(String cffFamilyDetailsDO) {
//		CffFamilyDetailsDO = cffFamilyDetailsDO;
//	}
	public String getCffSeq() {
		return cffSeq;
	}
	public void setCffSeq(String cffSeq) {
		this.cffSeq = cffSeq;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getRelationshipWithProposer() {
		return relationshipWithProposer;
	}
	public void setRelationshipWithProposer(String relationshipWithProposer) {
		this.relationshipWithProposer = relationshipWithProposer;
	}
	public String getNominee() {
		return Nominee;
	}
	public void setNominee(String nominee) {
		Nominee = nominee;
	}
	@Override
	public String toString() {
		return "cffFamilyDetailsDO [cffSeq=" + cffSeq + ", fullName="
				+ fullName + ", relationshipWithProposer="
				+ relationshipWithProposer + ", Nominee=" + Nominee + "]";
	}
	
	
    
    

}
