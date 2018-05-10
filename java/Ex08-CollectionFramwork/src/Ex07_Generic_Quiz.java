import java.util.ArrayList;
import java.util.List;

class Product {
}

class Tv extends Product {

	@Override
	public String toString() {
		return "TV";
	}

}

class Audio extends Product {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Audio";
	}

}

class NoteBook extends Product {

	@Override
	public String toString() {

		return "notebook";
	}

}

public class Ex07_Generic_Quiz {

	public static void main(String[] args) {
		// 1. Array 를 사용해서 cart 만들고 Cart 제품 (Tv, Audio, NoteBook)담으세요
		Product[] cart = new Product[3]; // 다형성을 사용한 배열
		cart[0] = new Tv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();

		// 2. ArrayList 를 사용해서 cart 만들고 Cart 제품 (Tv, Audio, NoteBook)담으세요
		// ArrayList<Product> pcart = new ArrayList<>();
		List<Product> pcart = new ArrayList<>();
		pcart.add(new Tv());
		pcart.add(new Tv());
		pcart.add(new Tv());
		pcart.add(new Audio());
		pcart.add(new NoteBook());
		pcart.add(new NoteBook());

		for (Product product : pcart) {
			System.out.println(product.toString());
		}

	}

}
