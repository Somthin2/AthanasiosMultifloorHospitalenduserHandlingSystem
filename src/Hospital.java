public abstract class Hospital
{

    private String HospitalName ;
    private int NumberOfRoomsPerFloor ;
    private int NumberOfFloors ;

    public Hospital(String HospitalName)
    {
        this.HospitalName = HospitalName ;
    }

    public void setNumberOfRoomsPerFloor(int NumberOfRoomsPerFloor)
    {
        this.NumberOfRoomsPerFloor = NumberOfRoomsPerFloor;
    }
}
