import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		PokeBag pokeBag = new PokeBag();
		Scanner sc = new Scanner(System.in);
//        System.out.println("args=" +  args[0]);

		System.out.println("���ϸ� �̸� �Է�: ���̼���(cp:1500), �����(cp:1500))");
		String player = sc.next();

		if (player.equals("���̼���")) {
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("���̼��̰� ���ᰡ �Ǿ���.");
			pokeBag.add(new Pokemon("���̼���", 1500));

		} else if (player.equals("�����")) {
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("����̰� ���ᰡ �Ǿ���.");
			pokeBag.add(new Pokemon("�����", 1500));
		} else {
			System.out.println("�̸��� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���.");
			System.out.println("���ϸ� �̸� �Է�: ���̼���(cp:1500), �����(cp:1500))");
			player = sc.next();
		}

		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");

		System.out.println("���׸��� ���ᰡ �Ǿ���.");
		pokeBag.add(new Pokemon("���׸�", 1024));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("���׸��װ� ���ᰡ �Ǿ���.");
		pokeBag.add(new Pokemon("���׸���", 215));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("������ ���ᰡ �Ǿ���.");
		pokeBag.add(new Pokemon("����", 816));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("���׸��װ� ���ᰡ �Ǿ���.");
		pokeBag.add(new Pokemon("���׸���", 136));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("�����󽺰� ���ᰡ �Ǿ���.");
		pokeBag.add(new Pokemon("������", 1822));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("������ ���ᰡ �Ǿ���.");
		pokeBag.add(new Pokemon("����", 215));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("������ ���ᰡ �Ǿ���.");
		pokeBag.add(new Pokemon("����", 185));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("������ ���ᰡ �Ǿ���.");
		pokeBag.add(new Pokemon("����", 110));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("�ϵ�ŷ�� ���ᰡ �Ǿ���.");
		pokeBag.add(new Pokemon("�ϵ�ŷ", 1709));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("������ ���ᰡ �Ǿ���.");
		pokeBag.add(new Pokemon("����", 39));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("���ڿ��� ���ᰡ �Ǿ���.");
		pokeBag.add(new Pokemon("���ڿ�", 12));
		
		System.out.println("�������� �̺�Ʈ�� �����Ͻðڽ��ϱ�? press 'y'/'n'");
		String choose = sc.next();
		if(choose.equals("y")) {
			System.out.println("���尭�� ������ �θ��ϴ�.");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("��ȯ�Ǿ����ϴ�.");
			System.out.println(pokeBag.getStrongest("����"));
		}else {
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("���κп� �̺�Ʈ�� �Ѿ� ���ϴ�.");
		}
		
		System.out.println("���κп� �̺�Ʈ�� �����Ͻðڽ��ϱ�? press 'y'/'n'");
		String choose2 = sc.next();

		if(choose2.equals("y")) {
			System.out.println("��� ���ϸ��� ���κп��� �����׽��ϴ�. ������ ���۵˴ϴ�.");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("���ڴ�");
			System.out.println(pokeBag.getStrongest());
		}else {
			System.out.println("��ī�� ��ȯ �̺�Ʈ�� �Ѿ�ϴ�.");
		}
		
		System.out.println("��ī���ȯ �̺�Ʈ�� �����Ͻðڽ��ϱ�? press 'y'/'n'");
		String choose3 = sc.next();
		
		if(choose3.equals("y")) {
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("��ī�� ��ȯ�մϴ�.");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("��ī�� �������� �ʽ��ϴ�.");
			pokeBag.getStrongest("��ī��");
			
			System.out.println("�ٽ��ѹ� ��ī���ȯ �̺�Ʈ�� �����Ͻðڽ��ϱ�? press 'y'/'n'");
			String choose4 = sc.next();
			
			
			if(choose4.equals("y")) {
				
				Thread.sleep(300);
				System.out.print(".");
				Thread.sleep(300);
				System.out.print(".");
				Thread.sleep(300);
				System.out.print(".");
				System.out.println("��ī�� ���ᰡ �Ǿ���.");
				pokeBag.add(new Pokemon("��ī��", 122));
				
			}else {
				System.out.println("�����մϴ�.");
			}
			
		}else {
			System.out.println("�����մϴ�.");
		}
		
		
		
		sc.next();
	}
}