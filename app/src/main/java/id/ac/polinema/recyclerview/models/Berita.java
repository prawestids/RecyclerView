package id.ac.polinema.recyclerview.models;

public class Berita {
    public String judul;
    public String company;
    public String image;

    public Berita(String judul, String company, String image) {
        this.judul = judul;
        this.company = company;
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
