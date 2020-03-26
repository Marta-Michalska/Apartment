import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Apartment apartment1 = new Apartment("Warsaw", 90, 6000);
        Apartment apartment2 = new Apartment("Cracow", 50, 7000);
        Apartment apartment3 = new Apartment("Gdansk", 121, 8345);

        List<Apartment> apartmentList = new ArrayList<>();
        apartmentList.add(apartment1);
        apartmentList.add(apartment2);
        apartmentList.add(apartment3);


        for (Apartment a : apartmentList) {
            System.out.println("Apartment in " + a.getCity() + " costs " + a.getFullPrice());
        }

        double x=0;
        for (int i = 0; i < apartmentList.size(); i++) {

            double a = apartmentList.get(i).getFullPrice();
            x+=a;

        }
        x=x/apartmentList.size();
        x=Round.round(x);
        System.out.println(x);
    }
}