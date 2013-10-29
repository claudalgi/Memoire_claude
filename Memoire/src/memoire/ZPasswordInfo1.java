package memoire;
public class ZPasswordInfo1 {

	private String no, nouv;

	public ZPasswordInfo1(){}
	public ZPasswordInfo1(String id, String nouv){
		this.no = id;
		this.nouv = nouv;
		
	}
	
	//------------------------------------
	
	public String getNo() {
		return no;
	}

	public void setNo(String num) {
		this.no = num;
	}

	//------------------------------------
	

	public String getNouv() {
		return nouv;
	}

	public void setNouv(String desc) {
		this.nouv = desc;
	}
	
	//------------------------------------
	
	public String toString(){
		String str;
		if(this.no != null && this.nouv != null ){
			//str = "Description de l'objet InfoZDialog";
			str = "UPDATE administrateur SET password=md5(\'"+ this.nouv + "\')";
			str += "WHERE login=\'"+ this.no +"\'";
					
		}
		else{
			str = "";
		}
		return str;
	}
}
