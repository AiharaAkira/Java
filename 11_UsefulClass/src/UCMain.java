import java.util.StringTokenizer;


public class UCMain {

	public static void main(String[] args) {

		String s = "�ȳ�";

		String ss = new String("�Ϳ� �� ����");

		// ss�� �ι�° ���� ���
		System.out.println(ss.charAt(1));

		// ss�� ����° ���� ���
		System.out.println(ss.charAt(2));

		// ss�� ��ü ���� �� ���
		System.out.println(ss.length());

		System.out.println("------------------------");
//		ss���� �� �̶�� ���ڰ� �� ��°�� �ֳ�? 3
		System.out.println(ss.indexOf("��"));
//		ss�� '��'�� ���� �ϴ� ��?t
		System.out.println(ss.startsWith("��"));
//		ss�� '��'���� �����°�?f
		System.out.println(ss.endsWith("��"));
//		ss�� '��'���� �����°�?t
		System.out.println(ss.endsWith("��"));
		System.out.println("------------------------");

		// �� -> ����
		System.out.println(ss.replace("��", "����"));
		ss = ss.replace("����", "��");
		// 2��° ~ 4��°
		System.out.println(ss.substring(1, 4));
		
		System.out.println("_________________");
		
		String sss = " ���, ����, �ٳ���";
		
		//���ڿ� �и�
		String[] sss2 = sss.split(",");
		
		for(String sss3:sss2) {
			System.out.println(sss3);
		}
		
		StringTokenizer st = new StringTokenizer(sss, ",");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(sss, ",");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		//���ڿ� ���̱�
		String s1 = "��";
		s1 += " ��";
		s1 += " ��";
		s1 += " ��";
		s1 += " ��";
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer();
		
		String s2 = "��";
		sb.append(s2);
		sb.append("��");
		sb.append("��");
		sb.append("��");
		sb.append("��");
		String s3 = sb.toString();
		System.out.println(sb);
		System.out.println(s3);
		
		
		
	}

}
