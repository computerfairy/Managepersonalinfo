
public class Contacts {
	String name; //����ó �̸�
    String number; //����ó ��ȭ��ȣ
    String mail; //����ó �̸���
    
    public Contacts(String name, String number, String mail){ //������
        this.name = name;
        this.number = number;
        this.mail = mail;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNumber(){
        return number;
    }
    
    public void SetNumber(String number){
        this.number = number;
    }

     public String getMail(){
        return mail;
    }

    public void setMail(String mail){
        this.mail = mail;
    }
}
