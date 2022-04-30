package edu.it;

public class SumarArray {
	public Integer sumar(Integer[] arrEnteros) {
		Integer total = 0;
		for (Integer z : arrEnteros) {
			total += z;
		}
		return total;
	}
	public Integer sumar(Integer x, Integer y) {
		return x + y;
	}
	public Integer sumar(Integer x, Integer y, Integer z) {
		return sumar(x, sumar(y, z));
	}	
	public Integer sumarConOtraNotacion(Integer... arrEnteros) {
		Integer total = 0;
		for (Integer z : arrEnteros) {
			total += z;
		}
		return total;
	}
}
