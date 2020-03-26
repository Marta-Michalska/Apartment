import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Apartment {

    private String city;
    private double area, priceM2;
    public double getPrice (){
        double z=area*priceM2;
        return Round.round(z);

    }
    public double getFullPrice(){
        double z=area*priceM2*0.95;

        return Round.round(z);
    }


}
