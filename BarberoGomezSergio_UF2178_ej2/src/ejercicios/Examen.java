package ejercicios;

public class Examen {

	public static void mostrar_imcs(double matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%.1f\t", matriz[i][j]);
			}
			System.out.println();
		}
	}

	public static double media_paciente(double matriz[][], int paciente) {

		double suma = 0;

		for (int mes = 0; mes < matriz[0].length; mes++) {
			suma = suma + matriz[paciente][mes];
		}

		return suma / matriz[0].length;
	}

}
