package HospitalManagements;
import java.util.*;

 class RegistrationPassword {

    long match = 9811644508l;
    Scanner sc = new Scanner(System.in);

    public void password() {

        System.out.println("************************************  REGISTRATION PASSWORD ****************************");

        try {
            do {

                System.out.println("Enter the password:");
                long password = sc.nextLong();

                if (match == password) {

                    System.out.println("Your password is Match and go through that");
                    return;

                } else {

                    System.out.println("Your password is Not match please enter the valid password");
                }

            } while (true);

        } catch (Exception e) {

            System.out.println("please Enter the valid password" + e);
        }
    }

    static class HospitalLis {
        String docName, splist, qua;
        int time, rNo;
        String loc, area, km, phoneNum;
        Scanner sc = new Scanner(System.in);

        public void highBudgetHospital() {

            try {
                System.out.println("******************************      WEL COME TO HIGH BUDGET HOSPITAL   ******************************");

                System.out.println("Enter the name of Doctor:");
                docName = sc.nextLine();

                System.out.println("Enter the specialist:");
                splist = sc.nextLine();

                System.out.println("Enter the Qualification:");
                qua = sc.nextLine();

                System.out.println("Enter the Timing:");
                time = sc.nextInt();

                System.out.println("Enter the Room number:");
                rNo = sc.nextInt();

                System.out.println("******   DOCTOR DETAILS   *******");
                System.out.println("\tDoctorName:->"+docName+"\tspecialist:->"+splist+"\tQualification:->"+qua+"\tTiming:->"+time+"\tRoomNumber:->"+rNo);

            } catch (Exception e) {

                System.out.println("Please enter the valid number" + e);
            }

            try {

                System.out.println("*********************************      LOCATION OF RAMAIAH HOSPITAL      **********************");

                loc = "New BEL Rd, M S Ramaiah Nagar";
                area = "MSRIT Post, Bengaluru, Karnataka 560054";
                km = " 10 KM ";
                phoneNum = "+918023608888";

                System.out.println("Location:->"+loc);
                System.out.println("Area:->"+ area);
                System.out.println("KiloMeter:->" + km);
                System.out.println("PhoneNumber:->" + phoneNum);


            } catch (Exception e) {

                System.out.println("Enter the valid number:" + e);
            }
        }

        public void mediumBudgetHospital() {

            try {
                System.out.println("****************************     WEL COME TO MEDIUM BUDGET HOSPITAL   ************************");

                System.out.println("Enter the name of Doctor:");
                docName = sc.nextLine();

                System.out.println("Enter the specialist:");
                splist = sc.nextLine();

                System.out.println("Enter the Qualification:");
                qua = sc.nextLine();

                System.out.println("Enter the Timing:");
                time = sc.nextInt();

                System.out.println("Enter the Room number:");
                rNo = sc.nextInt();

                System.out.println("******   DOCTOR DETAILS   *******");
                System.out.println("DoctorName:\t" + docName + "specialist:\t" + splist + "Qualification:\t" + qua + "Timing:\t" + time + "RoomNumber:\t" + rNo);

            } catch (Exception e) {

                System.out.println("Please enter the valid number" + e);
            }

            try {

                System.out.println("********************************       HOSPITAL LOCATION OF COLUMBIA ASIA HOSPITAL      **********************");

                loc = "26/4,Brigade Gateway,Malleshwaram West";
                area = "Beside Metro Cash and Carry West";
                km = " 16 KM ";
                phoneNum = "+919380086235";

                System.out.println("Location:->"+loc);
                System.out.println("Area:->"+ area);
                System.out.println("KiloMeter:->" + km);
                System.out.println("PhoneNumber:->" + phoneNum);

            } catch (Exception e) {

                System.out.println("Enter the valid number:" + e);
            }
        }

        public void lowBudgetHospital() {

            try {
                System.out.println("********************      WEL COME TO LOW BUDGET HOSPITAL      *********************");

                System.out.println("Enter the name of Doctor:");
                docName = sc.nextLine();

                System.out.println("Enter the specialist:");
                splist = sc.nextLine();

                System.out.println("Enter the Qualification:");
                qua = sc.nextLine();

                System.out.println("Enter the Timing:");
                time = sc.nextInt();

                System.out.println("Enter the Room number:");
                rNo = sc.nextInt();

                System.out.println("******   DOCTOR DETAILS   *******");
                System.out.println("DoctorName:\t"+ docName + "specialist:\t" + splist + "Qualification:\t" + qua + "Timing:\t" + time + " RoomNumber: \t" + rNo);

            } catch (Exception e) {

                System.out.println("Please enter the valid number:" + e);
            }

            try {
                System.out.println("************************         HOSPITAL LOCATION OF KOILABEN DHIRUBHAI AMBANI   **********************");

                loc = "Rao Saheb, Achutrao Patwardhan Marg";
                area = "Four Bungalows, Lokhandwala Complex Road";
                km = "500 KM";

                phoneNum = "+91938008666";
                System.out.println("Location:->"+loc);
                System.out.println("Area:->"+ area);
                System.out.println("KiloMeter:->" + km);
                System.out.println("PhoneNumber:->" + phoneNum);

            } catch (Exception e) {

                System.out.println("Enter the valid number:" + e);
            }
        }
    }

    static class PatientsDetail {

        String patName, dis, gend, admitS;
        int age;
        Scanner sc = new Scanner(System.in);

        public void patientList_1() {

            try {
                System.out.println("************************* WEL COME TO PATIENTS LIST *********************");

                System.out.println("Enter the name of Patients:");
                patName = sc.nextLine();

                System.out.println("Enter the Disease name:");
                dis = sc.nextLine();

                System.out.println("Enter the gender name:");
                gend = sc.nextLine();

                System.out.println("Enter the Admit Status:");
                admitS = sc.nextLine();

                System.out.println("Enter the value of age:");
                age = sc.nextInt();

                System.out.println("PatientName:\t" + patName + "Disease\t:" + dis + "Gender\t:" + gend + "Admit status\t:" + admitS + "Age\t:" + age);

            } catch (Exception e) {

                System.out.println("Please enter the valid number:" + e);
            }
        }
    }

    public class Core_java_project {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            RegistrationPassword rp = new RegistrationPassword();
            rp.password();

            HospitalLis hl = new HospitalLis();
            PatientsDetail pd = new PatientsDetail();


            System.out.println("1. For HighBudgetHospital including RamaiahHospital ");
            System.out.println("2. For MediumBudgetHospital including ColumbiaAsiaHospital");
            System.out.println("3. For LowBudgetHospital including Koilaben Dhirubhai Ambani Hospital");
            System.out.println("4. For PatientsList_1");

            try {

                int valu;

                do {

                    System.out.println("Enter the choice:");
                    int choice = sc.nextInt();

                    switch (choice) {

                        case 1:
                            hl.highBudgetHospital();
                            break;

                        case 2:
                            hl.mediumBudgetHospital();
                            break;

                        case 3:
                            hl.lowBudgetHospital();
                            break;

                        case 4:
                            pd.patientList_1();

                        default:
                            System.out.println("Invalid number:");
                    }

                    System.out.println("Enter the value 1 for continue 0 for Exit");
                    valu = sc.nextInt();

                } while (valu == 1);

            } catch (Exception e) {

                System.out.println("Enter the valid number:" + e);
            }
        }
    }
}
