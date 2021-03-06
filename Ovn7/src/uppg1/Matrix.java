package uppg1;

public class Matrix {
	private double[][] a;

	public Matrix(int n) {
		a = new double[n][n];
	}

	public double get(int i, int k) {
		return a[i][k];
	}

	public void add(Matrix m) {
		for (int i = 0; i < a.length; i++)
			for (int k = 0; k < a[0].length; i++)
				a[i][k] += m.get(i, k);
	}

	public double trace() {
		double tr = 0;
		for (int i = 0; i < a.length; i++)
			tr += a[i][i];
		return tr;
	}
}
