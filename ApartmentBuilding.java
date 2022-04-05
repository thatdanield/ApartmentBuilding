public class ApartmentBuilding extends Building{
    private double[] wattHours;
    public ApartmentBuilding(String address, int apartments) {
        super(address);
        wattHours = new double[apartments];
    }
    public double amountOwed() {
        double count = 0;
        for(double wattHour : wattHours) {
            count = count + wattHour*super.RATE;
        }
        return count;
    }
}
