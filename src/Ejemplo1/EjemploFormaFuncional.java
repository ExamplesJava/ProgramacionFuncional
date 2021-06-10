package Ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class EjemploFormaFuncional {
	private static final double IVA = 0.21;
	
	public static void main(String[] args) {
		List<Gasto> listaGasto = new ArrayList<Gasto>();
		listaGasto.add(new Gasto("A", 80));
		listaGasto.add(new Gasto("B", 50));
		listaGasto.add(new Gasto("C", 70));
		listaGasto.add(new Gasto("D", 95));
		
		double totalPago = listaGasto.stream()
				.mapToDouble(gasto -> gasto.getImporte() * (1 + IVA))
				.filter(gasto -> gasto < 100)
				.sum();
		System.out.println("Total pago: " + totalPago);
	}
}
