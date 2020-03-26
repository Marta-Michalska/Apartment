import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Apartment {

    private String city;
    private double area;
    private double priceM2;
    public double getPrice (){
        double z=area*priceM2;
        z*=100;
        z=Math.round(z);
        z/=100;
        return z;

    };
    public double getFullPrice(){
        double z=area*priceM2*0.95;
        z*=100;
        z=Math.round(z);
        z/=100;
        return z;
    }


}
