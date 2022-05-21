package designPatterns2;

public class FactoryDesignPattern {

}

interface SomeInterf{
	
}

abstract class Product {
	
}

class ProductA extends Product {
}

class ProductB extends Product {
}

class ProductC extends Product {
}

interface FactoryInterface {
	Product factoryMethod(String type);
}

class FactoryImpl implements FactoryInterface {

	@Override
	public Product factoryMethod(String type) {
		if ("ProductA".equals(type)) {
			new ProductA();
		} else if ("ProductB".equals(type)) {
			new ProductB();
		} else if ("ProductC".equals(type)) {
			return new ProductC();
		}
		System.out.println("pizza type is required");
		return null;
	}
}



