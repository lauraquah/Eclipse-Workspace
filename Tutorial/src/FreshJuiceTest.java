
class FreshJuice{
	//enums restrict a variable to have one of only a few predefined values
	//restrict the glass size to small, medium and large
	enum FreshJuiceSize{SMALL, MEDIUM, LARGE}
	FreshJuiceSize size;
}
public class FreshJuiceTest {

	public static void main(String[] args) {
		//declare new juice variable
		FreshJuice juice = new FreshJuice();
		
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		
		System.out.println("Size: " + juice.size);

		
	}

}
