package assign2.teaching;

public class Department extends Teacher implements College {
	int dnum;
	String dname;
	public int getDnum() {
		return dnum;
	}
	public void setDnum(int dnum) {
		this.dnum = dnum;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public static void main(String[] args) {
		Department d= new Department();
		d.setDnum(11);
		d.setDname("ENTC");
		d.setTname("ABC Mam");
		d.setQualification("M.Tech");
		System.out.println("Department Number :"+d.getDnum());
		System.out.println("Department Name :"+d.getDname());
		System.out.println("College Name :"+cname);
		System.out.println("Teacher Name :"+d.getTname());
		System.out.println("Teachers Qualification :"+d.Qualification);
		
	}

}
