package day18;

import java.util.Hashtable;

public class Qstn3 {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		hm.put(101, "abc");
		hm.put(107, "shine");
		hm.put(105, "merit");
		hm.put(209, "jhgf");
		System.out.println("current table is:" +hm);
		hm.remove(209);
		System.out.println(" after removal:" +hm);
		System.out.println(hm.getOrDefault(102, "Not Found")); 
		hm.putIfAbsent(102, "mathew");
		System.out.println("updated table:" +hm);
		hm.clone();
		System.out.println("clone method :" +hm);
		int hashcode=hm.hashCode();
	
		System.out.println("hashcode of the table" +hashcode);
		hm.clear();
		System.out.println("ah=fter clear method:" +hm);
	}
	

}
