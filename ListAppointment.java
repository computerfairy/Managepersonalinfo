import java.sql.SQLException;
import java.util.Scanner;

public class ListAppointment {
	private Scanner userInput = new Scanner(System.in);
	private AppointmentDAO dbAction = new AppointmentDAO();
	private int selectedAppointmentMenu = 0;
	private int selectedAppointment = 0;

	public void listAppointment() throws Exception {		
		while(selectedAppointmentMenu != 4) {
			dbAction.SelectAppointment("listAll", 0);
			System.out.println();
			
			System.out.println("--------��� ����--------");
			System.out.println("1. ��� ���");
			System.out.println("2. ��� ����");
			System.out.println("3. ��� ����");
			System.out.println("4. ���� �޴��� ���ư���");
			System.out.println("---------------------");
			System.out.print("���ϴ� �޴��� �Է��ϼ��� : ");
			
			try { 
				selectedAppointmentMenu = userInput.nextInt();
				System.out.println();
			} catch (Exception e) {
				System.out.println();
				System.out.println("���ڷ�  �ٽ� �Է����ּ���.");
				System.out.print("���ϴ� �޴��� �Է��ϼ���: ");
				userInput = new Scanner(System.in);
				selectedAppointmentMenu = userInput.nextInt();
			}
			
			checkAppointmentMenu();
		}
	}
	
	private void checkAppointmentMenu(){
		if(selectedAppointmentMenu < 1 || selectedAppointmentMenu > 4) {
			System.out.println("�ٽ� �Է����ּ���.");
			System.out.println();
		}
		
		if(selectedAppointmentMenu == 1) {
			try {
				dbAction.CreateAppointment();
				System.out.println();
			} catch (SQLException ex) {
				System.out.println("������ �߻��߽��ϴ�. �ٽ� �õ����ּ���");
				System.err.println(ex);
			}
		}
		
		if(selectedAppointmentMenu == 2) {
			try {
				System.out.print("������ ����� ��ȣ�� �Է����ּ���: ");
				selectedAppointment = userInput.nextInt();
				String aid = dbAction.SelectAppointment("getAid", selectedAppointment);
				dbAction.ModifyAppointment(aid);
				System.out.println();
			} catch (SQLException ex) {
				System.out.println("������ �߻��߽��ϴ�. �ٽ� �õ����ּ���");
				System.err.println(ex);
			}
		} 
		
		if(selectedAppointmentMenu == 3){
			try { 
				System.out.print("������ ����� ��ȣ�� �Է����ּ���: ");
				selectedAppointment = userInput.nextInt();
				String aid = dbAction.SelectAppointment("getAid", selectedAppointment);
				dbAction.DeleteAppointment(aid);
				System.out.println();
			} catch (SQLException ex) {
				System.out.println("������ �߻��߽��ϴ�. �ٽ� �õ����ּ���");
				System.err.println(ex);
			}
		}
	}	
}
