public class Item{

	String name;
	int price;
	//initial

public static void main(String[] args){

	Item xueping=new Item();
	xueping.name="血瓶";
	xueping.price=50;

	Item caoxie=new Item();
	caoxie.name="草鞋";
	caoxie.price=300;

	Item changjian=new Item();
	changjian.name="长剑";
	changjian.price=350;

System.out.println(xueping.name);
System.out.println(caoxie.price+changjian.price);

}
}