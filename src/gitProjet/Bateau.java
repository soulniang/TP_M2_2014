package gitProjet;

public class Bateau {
private int id;
private String nom;
private int tonnage;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getTonnage() {
	return tonnage;
}
public void setTonnage(int tonnage) {
	this.tonnage = tonnage;
}
@Override
public String toString() {
	return "Bateau [id=" + id + ", nom=" + nom + ", tonnage=" + tonnage + "]";
}


}
