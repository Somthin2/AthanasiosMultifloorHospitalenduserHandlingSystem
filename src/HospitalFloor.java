public class HospitalFloor extends HospitalEquipment
{
    public HospitalFloor(String HospitalName)
    {
        super(HospitalName);
    }

    public HospitalFloor(String HospitalName,int NumberOfRooms)
    {
        super(HospitalName);
        setNumberOfRoomsPerFloor(NumberOfRooms);
    }
}
