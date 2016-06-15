
import java.util.Scanner;
public class GradebookApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int numberStudents = 0;
		int amountM = 0;
		int amountF = 0;
		int amtDC = 0;
		int amtMD = 0;
		int amtVA = 0;
		int amtEcon = 0;
		int amtCompSci=0;
		int amtEE=0;
		String newOp="nothing";
		String choice = "continue";
		
		int nameCount=0;
		int dataCount=0;
		//
		String[][] studentData = new  String[100][6]; 
		
		while(choice.equals("continue")){
			
			System.out.println("Enter student name");
			studentData[nameCount][0]= keyboard.next();
			nameCount++;
			
			
			System.out.println("Type continue to keep entering student data");
			choice=keyboard.next();
			
			}
		
//		String[][] names = {
//	            {"Mr. ", "Mrs. ", "Ms. "},
//	            {"Smith", "Jones"}
//	        };
//	        // Mr. Smith
//	        System.out.println(names[0][0] + names[1][0]);
//	        names[1][1]="tpain";
//	        names[0][1]="bill";
//	        names[0][0]="sam";
//	        // Ms. Jones
//	        System.out.println(names[0][0] + names[1][1]);
	    }
		
	}


