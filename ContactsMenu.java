import java.util.*;

public class ContactsMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String name; //����ó �׸�-�̸�
        String number; //����ó �׸�-��ȭ��ȣ
        String mail; //����ó �׸�-�̸���
        int choose = -1; //����ó ���� �޴� ����
        List<Contacts> contactsList = new ArrayList<Contacts>(); //����ó ����Ʈ
        
       do{
           //����ó ���̱�. �̸� �������� ����
          /* Collections.sort(contactsList, new Comparator<Contacts>(){
               public int compare(Contacts contact1, Contacts contact2){
                   if(contact1.getName() > contact2.getName()){
                       return 1;
                   }else if(contact1.getName() < contact2.getName()){
                       return -1;
                   }else{
                       return 0;
                   }
               }
           
           });*/
    	   
    	   
           
           for(int i = 0; i < contactsList.size(); i++){
               System.out.println(contactsList.get(i).getName() + "  " + contactsList.get(i).getNumber() + " " + contactsList.get(i).getMail());
           }
           
           System.out.println("1. ����ó �߰�");
           System.out.println("2. ����ó ����");
           System.out.println("3. ����ó ����");
           System.out.println("4. ���� �޴��� ���ư���");
           System.out.println();
           System.out.println("���ϴ� �޴��� �Է��ϼ���: ");
           
           choose = sc.nextInt();
           
           switch(choose){
               case 1: 
                   CreateContacts();
                   break;
               case 2:
                   ChangeContacts();
                   break;
               case 3:
                   DeleteContacts();
                   break;
               case 4:
                   //return; ���� �޴��� ���ư�abstract
               default:
                   System.out.println("�ٽ� �Է����ּ���");
                   System.out.println("���ϴ� �޴��� �Է��ϼ���: ");
                    choose = sc.nextInt();
                   break;
           }

       }while(choose != 4);

	}
	
	public void CreateContacts(){
        
        // ��ȭ ���� ����
    }
    
    public void ChangeContacts(){  
        
    }
    
    public void DeleteContacts(){
    
    }

}
