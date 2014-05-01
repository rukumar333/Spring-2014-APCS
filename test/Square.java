public class Square extends Polygon{
    public int area(){
	return 1;
    }

    public static void main(String[] args){
	Polygon p = new Square();
	System.out.println(p.area());
    }
}
