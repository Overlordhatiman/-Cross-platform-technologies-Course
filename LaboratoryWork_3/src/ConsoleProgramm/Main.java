package ConsoleProgramm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import Calculator.CalculatorClass;

public class Main {

	// file name lib\7.bin
	public static void main(String[] args) throws IOException {
		List<Integer> num = null;

		if (args.length == 0) {
			System.out.println("”кажите путь к файлу");
			return;
		}

		try {
			num = readFile(args[0]);
		} catch (FileNotFoundException ex) {
			System.out.println("‘айл не найден");
			return;
		} catch (IOException ex) {
			System.out.println("ќшибка файла");
			return;
		}

		CalculatorClass obj = new CalculatorClass();

		for(int tau = -5; tau <= 5; tau++)
        {
            System.out.println("јвтокоррел€ци€(" + tau + "): " + obj.Autocorrelation(num,tau));
        }
		System.out.println("ƒинамический диапазон: " + obj.DynamicRange(num));
		System.out.println("Ёнерги€: " + obj.SignalEnergy(num));
		System.out.println("—редн€€ мощность: " + obj.AverageSignalStrength(num));
		System.out.println("—реднее значение: " + obj.AverageSignalSamplesValue(num));
		System.out.println("ƒисперси€: " + obj.SignalSampleValuesVariance(num));
		System.out.println("»нтервал коррел€ции: " + obj.CorrelationInterval(num));
	}

	public static List<Integer> readFile(String path) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		try (FileInputStream inputStream = new FileInputStream(path)) {
			int readResult;
			do {
				readResult = inputStream.read();

				if (readResult != -1) {
					list.add(readResult);
				}

			} while (readResult != -1);
		}

		return list;
	}
}