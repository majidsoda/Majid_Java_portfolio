package softskill;

public class ValidatePageCount {
	public static void main(String[] args) {
		
		selectParts("Interior");
		
		}
	
	public static void selectParts(String parts) {
		switch (parts) {
		case "Auto Body Parts & Mirrors":
		
		break;
		case "Headlights & Lighting":
			
			break;
		case "Engine & Drivetrain":
			
			break; 
		case "Brakes, Suspension & Steering":
			
			break;
		case "Interior":
			System.out.println("Floor Matts & Liners");
			break; 
		case "Tools & Garage":
			
			break;
		case "Wheels & Tires":
			
			break;
			default: System.out.println("Not Available");
			
		}
	}}
