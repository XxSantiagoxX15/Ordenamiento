package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ordering;

import co.edu.unbosque.view.ViewConsole;

/**
 * Controla la lógica de la aplicación, permitiendo agregar estudiantes y realizar ordenamientos.
 */
public class Controller {
	private Ordering or;
	private ViewConsole vc;

	 /**
     * Constructor que inicializa las instancias de Ordering y ViewConsole, y comienza la interacción.
     */
	public Controller() {
		or= new Ordering();
		vc=new ViewConsole();

		working();
	}
	
	/**
    * Método principal para interactuar con el usuario y ejecutar opciones.
    */
	public void working() { 
		String menu=" 1. Agregar Estudiante\n 2. Ordenar Burbuja\n 3. Ordenar Seleccion\n 4. Salir.";
		int option=0;
		do {
			option= vc.ReadInteger(menu);
			switch (option) {
			case 1:AddStudent();
			break;
			case 2:Orderbybubble(); 
			break;
			case 3:Orderbyselection();
			break;
			case 4: vc.SeeInfo("See you soon");
			break;
			default:vc.SeeInfo("Incorrect option,please selected diferent option");

			}

		}while(option != 4);

	}
	
	/**
     * Agrega un estudiante utilizando información proporcionada por el usuario.
     */
	public void AddStudent() {
		String	name= vc.ReadString("Insert name from student");
		int  Semester=vc.ReadInteger("Insert Semester from student");
		float average=vc.ReadFloat("Instert Average from student");
		int credits=vc.ReadInteger("Insert credits from student");
		or.insertStudent(name, average, credits, Semester);

	}

	 /**
     * Realiza ordenamientos utilizando el método de burbuja en diferentes criterios.
     */
	public void Orderbybubble() {
		String menu=" 1. Order by name\n 2. Order by semester\n 3. Order by average\n 4. Order by credits.\n 5. Main menu";
		int option=0;
		do {
			option= vc.ReadInteger(menu);
			switch (option) {
			case 1:or.OrderbyBubbleName(or.getStudents());
			break;
			case 2:or.OrderbyBubbleSemester(or.getStudents());
			break;
			case 3:or.OrderbyBubbleAverage(or.getStudents());
			break;
			case 4: or.OrderbyBubbleCredits(or.getStudents());
			break;
			case 5 : working();
			break;
			default:vc.SeeInfo("Incorrect option,please selected diferent option");

			}

		}while(option != 5);

	}
	
	/**
    * Realiza ordenamientos utilizando el método de selección en diferentes criterios.
    */
	public void Orderbyselection() {

		String menu3=" 1. Order by name\n 2. Order by semester\n 3. Order by average\n 4. Order by credits.\n 5. Main menu";
		int option=0;
		do {
			option= vc.ReadInteger(menu3);
			switch (option) {
			case 1:or.OrderbySelectedName(or.getStudents());
			break;
			case 2:or.OrderbySelectedSemester(or.getStudents());
			break;
			case 3:or.OrderbySelectedAverage(or.getStudents());
			break;
			case 4: or.OrderbySelectedCredits(or.getStudents());
			break;
			case 5 : working();
			break;
			default:vc.SeeInfo("Incorrect option,please selected diferent option");
			}

		}while(option != 5);

	}	
}
