package com.lab.view;

import com.lab.interfacing.InterfaceConsumer;
import com.lab.interfacing.InterfacePredicate;
import com.lab.utils.DoubleArrayUtils;

public class MaioresSalarios {

	public static void main(String[] args) {
		double[] salariosBrutos = { 1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00 };
		double[] salariosTop; 
		InterfacePredicate descontos = DoubleArrayUtils::filtraValores;
		salariosTop = descontos.executa(salariosBrutos, a -> a >= 3000.00);
		
		InterfaceConsumer apresente = DoubleArrayUtils::processaValores;
		apresente.executa(salariosTop, System.out::println);
	}

}
