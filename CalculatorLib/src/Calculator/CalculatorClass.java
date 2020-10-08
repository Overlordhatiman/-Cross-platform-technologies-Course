package Calculator;

import java.util.Collections;
import java.util.List;

public class CalculatorClass {

	public int DynamicRange(List<Integer> num) {
		int max = Collections.max(num);
		int min = Collections.min(num);

		return max - min;
	}

	public int SignalEnergy(List<Integer> num) {
		int result = 0;

		for (Integer i : num) {
			result += (i * i);
		}

		return result;
	}

	public double AverageSignalStrength(List<Integer> num) {
		double result = 0;

		for (Integer i : num) {
			result += (i * i);
		}

		return result / num.size();
	}

	public double AverageSignalSamplesValue(List<Integer> num) {
		double result = 0;

		for (Integer i : num) {
			result += i;
		}

		return result / num.size();
	}

	public double SignalSampleValuesVariance(List<Integer> num) {
		double m = AverageSignalSamplesValue(num);
		double result = 0;

		for (Integer i : num) {
			result += ((i - m) * (i - m));
		}

		return result / num.size();
	}

	public double Autocorrelation(List<Integer> num, int tau) {
		double m = AverageSignalSamplesValue(num);
		double result = 0;

		tau = (tau > 0) ? tau : -tau;

		for (int i = 0; i < num.size() - tau; i++) {
			result += (num.get(i + tau) - m) * (num.get(i) - m);
		}

		return result / (num.size() - tau);
	}

	public double CorrelationInterval(List<Integer> num) {
		double result = 0;

		for (int i = 0; i < num.size(); i++) {
			result += Autocorrelation(num, i);
		}

		return result / Autocorrelation(num, 0);
	}

}
