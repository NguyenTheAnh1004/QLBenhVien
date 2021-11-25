package DTO;

public class khambenh {
	private int sophieukham;
	private String ngaykham;
	private String trieutrung;
	private int mabenh;
	private int madv;
	private int mabn;
	private int mabs;
	
	public khambenh(){
		super();
		this.sophieukham=0;
		this.ngaykham=null;
		this.trieutrung=null;
		this.mabenh=0;
		this.madv=0;
	}

	
	public khambenh(int sophieukham, String ngaykham, String trieutrung,int mabs, int mabn, int mabenh, int madv) {
		this.sophieukham = sophieukham;
		this.ngaykham = ngaykham;
		this.trieutrung = trieutrung;
		this.mabs=mabs;
		this.mabn=mabn;
		this.mabenh = mabenh;
		this.madv = madv;
	}

	public int getMabn() {
		return mabn;
	}

	public void setMabn(int mabn) {
		this.mabn = mabn;
	}

	public int getMabs() {
		return mabs;
	}

	public void setMabs(int mabs) {
		this.mabs = mabs;
	}

	public int getSophieukham() {
		return sophieukham;
	}

	public void setSophieukham(int sophieukham) {
		this.sophieukham = sophieukham;
	}

	public String getNgaykham() {
		return ngaykham;
	}

	public void setNgaykham(String ngaykham) {
		this.ngaykham = ngaykham;
	}

	public String getTrieutrung() {
		return trieutrung;
	}

	public void setTrieutrung(String trieutrung) {
		this.trieutrung = trieutrung;
	}

	public int getMabenh() {
		return mabenh;
	}

	public void setMabenh(int mabenh) {
		this.mabenh = mabenh;
	}

	public int getMadv() {
		return madv;
	}

	public void setMadv(int madv) {
		this.madv = madv;
	}
	
}
