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
			System.out.println("������� ���� � �����");
			return;
		}

		try {
			num = readFile(args[0]);
		} catch (FileNotFoundException ex) {
			System.out.println("���� �� ������");
			return;
		} catch (IOException ex) {
			System.out.println("������ �����");
			return;
		}

		CalculatorClass obj = new CalculatorClass();

		for(int tau = -5; tau <= 5; tau++)
        {
            System.out.println("��������������(" + tau + "): " + obj.Autocorrelation(num,tau));
        }
		System.out.println("������������ ��������: " + obj.DynamicRange(num));
		System.out.println("�������: " + obj.SignalEnergy(num));
		System.out.println("������� ��������: " + obj.AverageSignalStrength(num));
		System.out.println("������� ��������: " + obj.AverageSignalSamplesValue(num));
		System.out.println("���������: " + obj.SignalSampleValuesVariance(num));
		System.out.println("�������� ����������: " + obj.CorrelationInterval(num));
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