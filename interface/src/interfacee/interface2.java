package interfacee;
interface bank{
	float getrateofintrest();
}
class SBI implements bank{
	public float getrateofintrest() {
		return 9.2f;
	}
}
class PNB implements bank{
	public float getrateofintrest() {
		return 9.6f;
	}
}
class interface2 {

	public static void main(String[] args) {
		SBI S=new SBI();
		System.out.println("sbi rate of intrest "+S.getrateofintrest());
		PNB P=new PNB();
		System.out.println("pnb rate of intrest"+P.getrateofintrest());
		bank b=new PNB();
		System.out.println("RBI verify ROI for PNB"+b.getrateofintrest());
		bank b1 = new SBI();
		System.out.println("RBI verify ROI for SBI"+b1.getrateofintrest());
	

	}

}
