package Ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class EjemploFormaImperativa {
	private static final double IVA = 0.21;
	
	public static void main(String[] args) {
		List<Gasto> listaGasto = new ArrayList<Gasto>();
		listaGasto.add(new Gasto("A", 80));
		listaGasto.add(new Gasto("B", 50));
		listaGasto.add(new Gasto("C", 70));
		listaGasto.add(new Gasto("D", 95));
		
		double totalPago = 0.0;
		for (Gasto gasto : listaGasto) {
			if ((gasto.getImporte() * (1 + IVA)) < 100) {
				totalPago += gasto.getImporte() * (1 + IVA);
			} else {
				System.out.println("Gasto no incluido: " + gasto.getImporte());
			}
		}
		
		System.out.println("Total pago: " + totalPago);
	}
}
