import java.util.ArrayList;

public class AMain2 {

	
	public static void main(String[] args) {
		
		//List 域伸: 亜痕 紫戚綜 壕伸 - 亜舌 弦戚 紫遂
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("0");
		al.add("1");
		al.add("33.1");
		al.add("せ");
		
		System.out.println(al.size());
		System.out.println(al);
		
		System.out.println("----------------------------");
		
		//<適掘什誤> : generic >> 汽戚斗 展脊聖 悪薦 馬澗 依
		ArrayList<String> all = new ArrayList<>();
		
		
		
		all.add("zzz");
		all.add("けけけ");
		all.add("せせせ");
		
		
		System.out.println(all.size());
		
		for (String str : all) {
			System.out.println(str);
		}
		
		System.out.println(all.get(0));
		
		System.out.println("----------------------------");
		
		all.add("ぞ"); //情薦窮走 蓄亜, 昔汽什3
		all.add(0,"a");//是帖 走舛 亜管
		all.set(1, "せさせ");//汽戚斗 葵 痕井 亜管
		all.remove(0);//汽戚斗葵 肢薦 亜管
		
		for(int i = 0; i< all.size(); i++) {
			
			System.out.println(all.get(i));
			
		}
		
		System.out.println("-------------------------");
		
		//al3 幻球偲辞 10,20 隔壱 窒径
		
		
		//神硯託授 舛慶
		
		
		
		
	}
	
}
