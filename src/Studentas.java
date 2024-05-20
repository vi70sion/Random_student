public class Studentas {
    private String vardas, pavarde;
    int[] pazymiai;

    public Studentas(String vardas, String pavarde, int[] pazymiai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pazymiai = pazymiai;
    }

    public String getVardas() { return vardas; }
    public String getPavarde() { return pavarde; }
    public int[] getPazymiai() { return pazymiai; }
    public void setVardas(String vardas) { this.vardas = vardas; }
    public void setPavarde(String pavarde) { this.pavarde = pavarde; }
    public void setPazymiai(int[] pazymiai) { this.pazymiai = pazymiai; }

    public double skaiciuokVidurki(Studentas studentas){
        double vidurkis = 0;
        for(int item: getPazymiai()){
            vidurkis += item;
        }
        return vidurkis / getPazymiai().length;
    }


}
