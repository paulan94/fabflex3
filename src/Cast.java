public class Cast{
	
	private int fid;
	private String title;
	private String stagename;
	private String director;

	
	public Cast(){
	}
	
	public Cast(String title, String stagename, String director){
		this.fid = 000;
		this.title = title;
		this.stagename = stagename;
		this.director = director;

	}
	
	public int getId() {
		return fid;
	}

	public void setId(int id) {
		this.fid = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStagename() {
		return stagename;
	}

	public void setStagename(String stagename) {
		this.stagename = stagename;
	}
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
}