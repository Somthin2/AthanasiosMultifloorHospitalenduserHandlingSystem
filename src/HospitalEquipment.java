public class HospitalEquipment extends Hospital
{
    private final String[] emergencyRoomEquipment = {
            "Crash cart",
            "Defibrillator",
            "Oxygen delivery systems",
            "ECG machine",
            "Suction machine",
            "Triage area equipment"
    };

    private final String[] operatingRoomEquipment = {
            "Operating table",
            "Surgical lights",
            "Anesthesia machine",
            "Electrocautery machine",
            "Surgical instruments",
            "Sterilization equipment"
    };

    private final String[] icuEquipment = {
            "Ventilator",
            "Patient monitors",
            "Infusion pumps",
            "IV poles and stands",
            "Hemodialysis machine",
            "Central venous catheterization supplies"
    };

    private final String[] pharmacyEquipment = {
            "Medication dispensing systems",
            "Compounding equipment",
            "Refrigeration for medications",
            "Prescription filling and labeling systems"
    };

    private final String[] patientRoomEquipment = {
            "Hospital bed",
            "Patient monitors",
            "Overbed tables",
            "Bedside cabinets",
            "Call bell systems",
            "Vital sign measurement tools"
    };

    public HospitalEquipment(String HospitalName)
    {
        super(HospitalName);
    }
}
