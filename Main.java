class Sinobi{
	private String reg, nama, peringkat;
	
	public String getReg(){
		return reg;
	}
	
	public void setReg(String reg){
		this.reg = reg;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public String getPeringkat(){
		return peringkat;
	}
	
	public void setPeringkat(String peringkat){
		this.peringkat = peringkat;
	}
}

public class Main{
	public static void main(String[] args){
		Sinobi[] e = new Sinobi[3];
		
		e[0] = new Sinobi();
		e[0].setReg("012606");
		e[0].setNama("Uciha Sasuke");
		e[0].setPeringkat("Genin");
		
		e[1] = new Sinobi();
		e[1].setReg("012607");
		e[1].setNama("Uzumaki Naruto");
		e[1].setPeringkat("Genin");
		
		e[2] = new Sinobi();
		e[2].setReg("012601");
		e[2].setNama("Haruno Sakura");
		e[2].setPeringkat("Cunin");
		
		System.out.println("==================");
		System.out.println("DATA SINOBI KONOHA");
		System.out.println("==================");
		System.out.println();
		for(Sinobi x:e){
			System.out.println("No. Registrasi 	: "+x.getReg());
			System.out.println("Nama 		: "+x.getNama());
			System.out.println("Peringkat	: "+x.getPeringkat());
			System.out.println("===================================");
			System.out.println();
		}
		
	}
}