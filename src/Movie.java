public class Movie{
	
	private int id;
	private String title;
	private int year;
	private String director;
	private String banner_url;
	private String trailer_url;
	
	public Movie(){
	}
	
	public Movie(String title, int year, String director){
		this.id = 000;
		this.title = title;
		this.year = year;
		this.director = director;
		this.banner_url = null;
		this.trailer_url = null;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getBanner_url() {
		return banner_url;
	}

	public void setBanner_url(String banner_url) {
		this.banner_url = banner_url;
	}

	public String getTrailer_url() {
		return trailer_url;
	}

	public void setTrailer_url(String trailer_url) {
		this.trailer_url = trailer_url;
	}
	
}