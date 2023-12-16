public class HospitalRoom extends HospitalFloor
{
    private int NumberOfRoom ;
    private int NumberOfBed ;
    private double TariffRS ;
    private final String[] hospitalRooms = {
            "Emergency Room",
            "Operating Room",
            "ICU",
            "Pharmacy",
            "Patient Room"
    };
    public HospitalRoom(String HospitalName)
    {
        super(HospitalName);
    }
}
