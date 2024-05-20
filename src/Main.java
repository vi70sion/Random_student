import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Sukurkite klasę Studentas, kuri turėtų laukus vardas, pavarde ir sąrašą pažymių.
//        Parašykite metodą, kuris apskaičiuotų vidutinį pažymį. Tada parašykite funkciją,
//        kuri sugeneruos n studentų su atsitiktiniais pažymiais ir atspausdins visų studentų vardus,
//        pavardes ir jų vidurkius. Studentus sugeneruoti reikia random is vardu masyvo elementų ir pavardžių masyvo elementų

        final int PAZ_DYDIS = 10;
        final int N = 10;   //studentų skaičius

        Studentas[] studentai = new Studentas[N];
        String[] vardai = {"Antanas", "Dalia", "Jurgita", "Saulius", "Virgis", "Edita", "Ingrida", "Simas" };
        String[] pavardes = {"Kazlauskas", "Petraitis", "Mikutis", "Pavardaitis", "Jurgaitis", "Zuokas", "Stonkus", "Katleris" };
        for(int i = 0; i < N; i++) {
            studentai[i] = new Studentas(atsitiktinisIsMasyvo(vardai), atsitiktinisIsMasyvo(pavardes), atsitiktiniaiPazymiai(PAZ_DYDIS));
        }
        double visuVidurkis = 0;
        for(Studentas item: studentai){
            visuVidurkis += item.skaiciuokVidurki(item);
            System.out.println(item.getVardas() + " " + item.getPavarde() + ", vidurkis " + item.skaiciuokVidurki(item));
        }
        visuVidurkis /= N;
        System.out.println("Visų studentų vidurkis: "+ String.format("%.1f%n", visuVidurkis));

    }

    public static String atsitiktinisIsMasyvo(String[] masyvas){
        Random random = new Random();
        int randomNumber = random.nextInt(masyvas.length - 1) + 1;
        return masyvas[randomNumber];
    }

    public static int[] atsitiktiniaiPazymiai(int n){
        Random random = new Random();
        int[] masyvas = new int[n];
        for(int i = 0; i < n; i++){
            masyvas[i] = random.nextInt(9) + 1;
        }
        return masyvas;
    }

}