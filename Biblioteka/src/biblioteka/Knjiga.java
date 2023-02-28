package biblioteka;

import java.util.List;
import java.util.Objects;

public class Knjiga {
	
	private String naslov;
	private long isbn;
	private List<Autor> autori;
	private String izdavac;
	private int izdanje;
	
	public String getNaslov() {
		return naslov;
	}
	
	public long getIsbn() {
		return isbn;
	}
	
	public List<Autor> getAutori() {
		return autori;
	}
	
	public String getIzdavac() {
		return izdavac;
	}
	
	public int getIzdanje() {
		return izdanje;
	}
	
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}
	
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}

	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + autori + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		return isbn == other.isbn;
	}
	
	
	
}
