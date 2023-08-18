package co.edu.unbosque.model;

import java.util.ArrayList;

/**
 * La clase Ordering maneja la lógica de ordenamiento de estudiantes utilizando los métodos de burbuja y selección.
 */
public class Ordering {
	private ArrayList <Student> Students; 

	/**
	 * Constructor de la clase Ordering que inicializa la lista de estudiantes.
	 */
	public Ordering() {
		Students= new ArrayList<Student>();
	}	

	/**
	 * Inserta un nuevo estudiante en la lista de estudiantes.
	 *
	 * @param Nombre     El nombre del estudiante a agregar.
	 * @param Promedio   El promedio del estudiante a agregar.
	 * @param Creditos   La cantidad de créditos del estudiante a agregar.
	 * @param semestre   El semestre del estudiante a agregar.
	 * @return True si el estudiante se agregó exitosamente, de lo contrario False.
	 */
	public boolean insertStudent(String Name,Float Average,int Credits,int Semester) {
		Student nuevo =new Student(Average,Name,Credits,Semester);
		Students.add(nuevo);
		return true;

	}

	/**
	 * Intercambia dos elementos en una lista de estudiantes.
	 *
	 * @param Students La lista de estudiantes en la que se realizará el intercambio.
	 * @param i Índice del primer elemento a intercambiar.
	 * @param j Índice del segundo elemento a intercambiar.
	 */
	private  void Swap (ArrayList<Student> Students, int i, int j) {
		Student temp = Students.get(i);
		Students.set(i, Students.get(j));
		Students.set(j, temp);
	}

	/**
	 * Ordena una lista de estudiantes utilizando el algoritmo de burbuja según el nombre del estudiante.
	 *
	 * @param Students La lista de estudiantes a ordenar.
	 */
	public void OrderbyBubbleName(ArrayList<Student> Students) {
		long startTime = System.nanoTime();
		int n = Students.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (Students.get(j).getName().compareToIgnoreCase(Students.get(j + 1).getName()) > 0) {
					Swap(Students, j, j + 1);
				}
			}
		}

		for (Student student : Students) {
			System.out.println(student.toString());
		}

		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds: " + timeElapsed);
	}

	/**
	 * Ordena una lista de estudiantes utilizando el algoritmo de burbuja según el semestre del estudiante.
	 *
	 * @param Students La lista de estudiantes a ordenar.
	 */
	public void  OrderbyBubbleSemester(ArrayList<Student>Students) {
		long startTime = System.nanoTime();
		int n=Students.size();
		for(int i=0;i<n-i-1;i++) {

			for(int j=0;j<n-i-1;j++) {
				if(Students.get(j).getSemester()<(Students.get(j+1).getSemester())){

					Swap(Students,j,j+1);
				}
					for (Student student : Students) {
						System.out.println(student.toString());
					

				}
			}

		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds: " + timeElapsed);
	}

	/**
	 * Ordena una lista de estudiantes utilizando el algoritmo de burbuja según el promedio del estudiante.
	 *
	 * @param Students La lista de estudiantes a ordenar.
	 */
	public void  OrderbyBubbleAverage(ArrayList<Student>Students) {
		long startTime = System.nanoTime();
		int n=Students.size();
		for(int i=0;i<n-i-1;i++) {

			for(int j=0;j<n-i-1;j++) {
				if(Students.get(j).getAverage()<(Students.get(j+1).getAverage())){

					Swap(Students,j,j+1);
				}	
					for (Student student : Students) {
						System.out.println(student.toString());
					

				}
			}
		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds: " + timeElapsed);
	}

	/**
	 * Ordena una lista de estudiantes utilizando el algoritmo de burbuja según los créditos del estudiante.
	 *
	 * @param Students La lista de estudiantes a ordenar.
	 */
	public void  OrderbyBubbleCredits(ArrayList<Student>Students) {
		long startTime = System.nanoTime();
		int n=Students.size();
		for(int i=0;i<n-i-1;i++) {

			for(int j=0;j<n-i-1;j++) {
				if(Students.get(j).getCredits()<(Students.get(j+1).getCredits())){

					Swap(Students,j,j+1);
				}
					for (Student student : Students) {
						System.out.println(student.toString());
					

				}

			}
		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds: " + timeElapsed);
	}

	/**
	 * Ordena una lista de estudiantes utilizando el algoritmo de selección según el nombre del estudiante.
	 *
	 * @param Students La lista de estudiantes a ordenar.
	 */
	public void OrderbySelectedName(ArrayList<Student> Students) {
		long startTime = System.nanoTime();
		int n = Students.size();
		for (int i = 0; i < n - 1; i++) {
			int minimo = i;
			for (int j = i + 1; j < n; j++) {
				if (Students.get(j).getName().compareToIgnoreCase(Students.get(minimo).getName()) < 0) {
					minimo = j;
				}
			}

			Swap(Students, i, minimo);  
		}
		for (Student student : Students) {
			System.out.println(student.toString());
		}

		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds: " + timeElapsed);
	}



	/**
	 * Ordena una lista de estudiantes utilizando el algoritmo de selección según el semestre del estudiante.
	 *
	 * @param Students La lista de estudiantes a ordenar.
	 */
	public void OrderbySelectedSemester(ArrayList<Student>Students) {
		long startTime = System.nanoTime();
		int n=Students.size();
		for(int i=0;i<n-i-1;i++) {
			int minimo=i;
			for (int j = i + 1; j < n; j++) {
				if(Students.get(j).getSemester()>(Students.get(minimo).getSemester())){
					minimo=j;
				}
			}
			Swap(Students,i,minimo);
		}	
			for (Student student : Students) {
				System.out.println(student.toString());
			
	    }
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds: " + timeElapsed);
	}

	/**
	 * Ordena una lista de estudiantes utilizando el algoritmo de selección según el promedio del estudiante.
	 *
	 * @param Students La lista de estudiantes a ordenar.
	 */
	public void OrderbySelectedAverage(ArrayList<Student>Students) {
		long startTime = System.nanoTime();
		int n=Students.size();
		for(int i=0;i<n-i-1;i++) {
			int minimo=i;
			for (int j = i + 1; j < n; j++) {
				if(Students.get(j).getAverage()>(Students.get(minimo).getAverage())){
					minimo=j;
				}
			}
			Swap(Students,i,minimo);
		}
			for (Student student : Students) {
				System.out.println(student.toString());
			
		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds: " + timeElapsed);
	}

	/**
	 * Ordena una lista de estudiantes utilizando el algoritmo de selección según los créditos del estudiante.
	 *
	 * @param Students La lista de estudiantes a ordenar.
	 */
	public void OrderbySelectedCredits(ArrayList<Student>Students) {
		long startTime = System.nanoTime();
		int n=Students.size();
		for(int i=0;i<n-1-i;i++) {
			int minimo=i;
			for (int j = i + 1; j < n; j++) {
				if(Students.get(j).getCredits()>(Students.get(minimo).getCredits())){
					minimo=j;
				}
			}
			Swap(Students,i,minimo);
		}
			for (Student student : Students) {
				System.out.println(student.toString());
			
		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds: " + timeElapsed);
	}

	/**
	 * Obtiene la lista de estudiantes actual.
	 *
	 * @return La lista de estudiantes.
	 */
	public ArrayList<Student> getStudents() {
		return Students;
	}

	/**
	 * Establece la lista de estudiantes.
	 *
	 * @param students La lista de estudiantes a establecer.
	 */
	public void setStudents(ArrayList<Student> students) {
		Students = students;
	}



}
