import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ContactMenu {
	private ArrayList<Contact> contactList;
	Scanner scan = new Scanner(System.in);

	public ContactMenu() {
		contactList = new ArrayList<Contact>();
		Scanner sc = new Scanner(System.in);
		int menuChoose = -1;

		do {
			if (contactList.isEmpty()) {
				printContactListIsEmpty();
			} else {
				Collections.sort(contactList);
				printContactList();
			}

			printContactMenu();

			while (true) {
				try {
					menuChoose = sc.nextInt();
					break;
				} catch (Exception e) {
					sc = new Scanner(System.in);

					System.out.println();
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					System.out.print("���ϴ� �޴��� �Է��ϼ���: ");
				}
			}

			System.out.println();

			switch (menuChoose) {
			case 1:
				createContact();
				break;
			case 2:
				changeContact();
				break;
			case 3:
				deleteContact();
				break;
			case 4:
				main_menu.main(null);
				break;
			default:
				System.out.println("�ٽ� �Է����ּ���");
				System.out.println("���ϴ� �޴��� �Է��ϼ���: ");
				menuChoose = sc.nextInt();
				break;
			}

		} while (menuChoose != 4);
	}

	public void printContactListIsEmpty() {
		System.out.println("����ó�� �����ϴ�.");
		System.out.println();
	}

	public void printContactList() {
		System.out.println();

		for (int i = 0; i < contactList.size(); i++) {
			System.out.println(contactList.get(i).toString());
		}

		System.out.println();
	}

	public void printContactMenu() {
		System.out.println("1. ����ó �߰�");
		System.out.println("2. ����ó ����");
		System.out.println("3. ����ó ����");
		System.out.println("4. ���� �޴��� ���ư���");
		System.out.println();
		System.out.print("���ϴ� �޴��� �Է��ϼ���: ");
	}

	public void createContact() {
		String name;
		String number;
		String email;

		System.out.print("�̸�: ");
		name = scan.nextLine();
		System.out.print("��ȣ: ");
		number = scan.nextLine();
		System.out.print("�̸���: ");
		email = scan.nextLine();

		Contact contact = new Contact(name, number, email);

		contactList.add(contact);
	}

	public void changeContact() {
		String name;
		String newName, newNumber, newEmail;

		System.out.print("�����ϰ� ���� ����� �̸��� �Է��ϼ���: ");
		name = scan.nextLine();

		for (Contact con : contactList) {
			if (name.equals(con.getName())) {
				System.out.println();
				System.out.println(con.toString());
				System.out.println();
				
				System.out.println("������ ������ �Է��ϼ���");

				System.out.print("�̸�: ");
				newName = scan.nextLine();
				System.out.print("��ȣ: ");
				newNumber = scan.nextLine();
				System.out.print("�̸���: ");
				newEmail = scan.nextLine();

				con.setName(newName);
				con.setNumber(newNumber);
				con.setEmail(newEmail);
			}
		}

	}

	public void deleteContact() {
		String name;

		System.out.print("����� ���� �̸��� �Է��ϼ���: ");
		name = scan.nextLine();

		Iterator<Contact> iter = contactList.iterator();
		while (iter.hasNext()) {
			Contact cont = iter.next();

			if (name.equals(cont.getName()))
				iter.remove();
		}

	}

	public static void main(String[] args) {
		new ContactMenu();
	}

}
