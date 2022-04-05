import java.util.ArrayList;

public class ServiceArea
{
    private ArrayList<Building> allBuildings;   // a list of all buildings

    public ServiceArea()
    {
        allBuildings = new ArrayList();
    }

    public double totalSales()
    {
        double count = 0;
        for (Building building : allBuildings) {
            count = count + building.amountOwed();
        }
        return count;
    }
}
