import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Building {

    private int roomsCount;
    private int windowsCount;
    private double area;
    private int flatsCount;
    private boolean HasGarage;
    private boolean hasGarden;
    private boolean hasGym;

}
