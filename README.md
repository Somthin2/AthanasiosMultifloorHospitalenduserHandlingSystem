# Athanasios Multi-floor Hospital end-user Handling System

## In case running the program might seem difficult i will provide a video of me going over the general use of the system Video URL : https://www.youtube.com/watch?v=zRm0PQgyc-M

## General idea of the project:

    The General idea of this project is to create a System that will handle any type of person in a hospital and manage their data correctly. Also the project handles one to many users.

## Different types of Users:

### Reseptionist
    The Reseptionist handles the creation of Doctors and Patients (enters their information and the information gets updated into the database) also the Reseptionist handles the Channels where each Reseptionist is able to see which Doctors are available to be able to assign them on a channel with a Patient. For assigning a Doctor to a Patient the Reseptionist should enter the Rooms Number and Floor (When the Reseptionist selects the floor the system checks the database so it can display the available Rooms on that floor) and after that information is added the Reseptionist should add a day from the calender displayed on the system (When the day is selected the System checks from the database if the doctor has already another appointment on the same day and if yes a message box gets dispalyed telling the Reseptionist ot select another day) 
### Doctor
    The Doctor can update his own information in case of a mistake from the Reseptionist (Also his username and password will be given upond registration from the Reseptionist). Also the Doctor is able to view the channels the Reseptionist assigned to him (The information shown to the Doctor will be "Channel ID", his name so hes sure a mistake didnt happen, "Patients Name", "Room No" (No need for floor because the floor is idicated by the room Ex 101 is in floor 1 and 404 is in the fourth floor), "Date") While viewing the channels the Doctor can select the channel and give a prescription for the Patient. For Presctiption the Doctor only needs to enter what type of disease the patient is diagnosed by.

### Pharmacist
    The Pharmacist handles the items in general. The Pharmacist is responsible to add the items that are in the Pharmacy (The information that need to be inputed is the following : "Item Name" , "Sell Price", "Buy Price", "Amount").
    The Pharmacist is able to see the Prescriptions given by all the doctors and based on there Prescription the Pharmacist will give the corrisponding Item and amount of the item needed to the Patient. If the pharmacist enters for ex.
    to give 4 panadols to a patient but the pharmacy has only 2 it will not create the transaction and it will show the Pharmacist a error telling him the amount left of the specific item in the Pharmacy. But in case the Pharmacist enters 2 pandols and the pharmacy has excacly 2, the transaction will be created and the panadol will get deleted from the database since there wont be any left. Also the pharmacist is able to see a trasaction log with all the transactions that happend in the pharmacy with all the information of the transaction and the Pharmacist will also be able to see the profit the Pharmacy has got from all the Items sold.

## How a test run of the Program should go
    First create a Reseptionist create a doctor and then a patient, go to channels assign the doctor to the corisponding patient (also fill in any information needed). Login the Doctors account then view the channel he was assigned, add a prescription. Then create a Pharmacist Account, login to that account, create a item and then go to the prescriptions and assign your item to the patient and after that you can go watch your transaction record by clicking the records label seen in the Pharmacist home form. And thats the full guide on how to work the whole program.

## General CLasses for helping with the information handling

### HospitalMS
    HospitalMS is the main class of the program and should be the first class to be runned for everything to work correctly.
### DatabaseConnection
    DatabaseConnection is a class made so its easier for me to use some SQL commands.
### Hospital
    Hospital class acts as a session file and a temporary database. It handles information for the current Reseptionist / Doctor (No need for Pharmacist since they do not have anything unique). Also gets filled with all the Doctors, Items, Patients, Rooms, Users from the database when needed so its easier to get the information.
### User
    The User Class gets created on login so we are able to decide on which of the forms to load based on the getPermission() method and have the current users information through out the code until he/she presses logout.
