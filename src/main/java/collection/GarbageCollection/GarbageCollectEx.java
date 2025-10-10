package collection.GarbageCollection;

import java.lang.ref.WeakReference;

public class GarbageCollectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// without gc
		Phone phone = new Phone("Apple",17);
		System.out.println(phone);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(phone);
		
		
		System.out.println("************************************************************");
	
		
		
		//With gc ( garbage collection ) no associated value will not remove
		WeakReference<Phone> phoneWeakReference = new WeakReference<Phone>(new Phone("Samsung",5));
		
		System.out.println(phoneWeakReference);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(phoneWeakReference);
		
		
System.out.println("************************************************************");
	
		
		
		//With gc ( garbage collection ) now associated value will remove
		WeakReference<Phone> phoneWeakReference1 = new WeakReference<>(new Phone("Nokia",3310));
		
		System.out.println(phoneWeakReference1);
		System.gc();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(phoneWeakReference1.get());
		
		
	}

}

class Phone{
	String brandName;
	int modelNumber;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	@Override
	public String toString() {
		return "Phone [brandName=" + brandName + ", modelNumber=" + modelNumber + "]";
	}
	public Phone(String brandName, int modelNumber) {
		super();
		this.brandName = brandName;
		this.modelNumber = modelNumber;
	}
	public Phone() {
		super();
	}
	
	
	
	
}