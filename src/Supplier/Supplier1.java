package Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Supplier1 {
public static void main(String[] args) {
	List<String> names=new ArrayList<>();
	names.add("rashid");
	names.add("faiz");
	names.add("abu shad");

	Supplier<String> name= ()->names.toString();
	System.out.println(name.get());
}
}
