package co.edu.unbosque.model;

/**
 * Clase de un estudiante con información como promedio, nombre, semestre y créditos.
 */

public class Student {
private float Average ;
private String Name;
private int Semester;
private int Credits;

/**
 * Constructor de la clase Student para inicializar los atributos.
 */
public Student(float Average,String Name,int Credits,int Semester) {
	
	this.Credits=Credits;
	this.Name=Name;
	this.Average=Average;
	this.Semester=Semester;
}

// Getters y setters para los atributos
public float getAverage() {
	return Average;
}

public void setAverage(float average) {
	Average = average;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getSemester() {
	return Semester;
}

public void setSemester(int semester) {
	Semester = semester;
}

public int getCredits() {
	return Credits;
}

public void setCredits(int credits) {
	Credits = credits;
}
/**
 * Devuelve una representación en cadena de texto de un objeto Student.
 */
public String toString() {
	return "Student [Average=" + Average + ", Name=" + Name + ", Semester=" + Semester + ", Credits=" + Credits + "]";
}









}
