package edu.escuelaing.arep.app;

import java.awt.List;
import java.util.ArrayList;

public class Calculator {
	/**
	 * Realiza diferentes calculos a la lista que entra
	 */
	private ArrayList<Double> list = new ArrayList<Double>();
	
	public Calculator(ArrayList<Double> list) {
		this.list = list;
	}
	
	public ArrayList<Double> bubbleSort() {
		double temp;
		int len = list.size();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (list.get(j) < list.get(j + 1)) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		return list;
	}
	/**
	 * Suma los valores de la lista
	 * @return suma
	 */
	public double sum() {
		double suma = 0;
		for (int i = 0; i < list.size(); i++) {
			suma += list.get(i);
		}
		return Math.round(suma * 100.0) / 100.0;
	}
	/**
	 * saca el promedio de la lista
	 * @return promedio
	 */
	public double average() {
		double average = 0;
		double suma = this.sum();
		average = suma / list.size();
		return Math.round(average * 100.0) / 100.0;
	}
}
