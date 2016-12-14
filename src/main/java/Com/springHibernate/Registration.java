package Com.springHibernate;

public class Registration {

	private String Rname;
	private String Rid;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(String rname, String rid) {
		super();
		Rname = rname;
		Rid = rid;
	}

	public String getRname() {
		return Rname;
	}

	public void setRname(String rname) {
		Rname = rname;
	}

	public String getRid() {
		return Rid;
	}

	public void setRid(String rid) {
		Rid = rid;
	}

	@Override
	public String toString() {
		return "Registration [Rname=" + Rname + ", Rid=" + Rid + "]";
	}

}
