public class Hero {
	String name;
	float hp;
	float armor;
	int speed;

public static void main(String[] args) {
Hero wukong=new Hero();
wukong.name="悟空";
wukong.hp=888.8f;
wukong.armor=90.0f;
wukong.speed=5;

Hero timo=new Hero();
timo.name="提莫";
timo.hp=666.6f;
timo.armor=30.0f;
timo.speed=8;
	
System.out.println(timo.speed+wukong.hp);
}
}