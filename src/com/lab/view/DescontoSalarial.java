package com.lab.view;

import com.lab.interfacing.InterfaceConsumer;
import com.lab.interfacing.InterfaceUnary;
import com.lab.utils.DoubleArrayUtils;

public class DescontoSalarial {

	public static void main(String[] args) {
		double[] salariosBrutos = { 1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00 };
		double[] salariosLiquidos; 
		InterfaceUnary descontos = DoubleArrayUtils::transformaValores;
		salariosLiquidos = descontos.executa(salariosBrutos, a -> 0.9 * a);
		
		InterfaceConsumer apresente = DoubleArrayUtils::processaValores;
		apresente.executa(salariosLiquidos, System.out::println);	
	}

}
