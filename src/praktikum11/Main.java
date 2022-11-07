package praktikum11;

public class Main {
   public static void main(String[] args) {
	   Family family = new Family();
	   //tambah keponakan
	   family.addNiece("Salman", 10, 10);
	   family.addNiece("Akbar", 7, 12);
	   
	   //mengecek jika ada keponakan yang sama
	   if(family.addNiece("Salman", 10, 10)) System.out.println("Kamu memasukkan nama keponakan yang sama");
	   
	   //menambah paman
	   family.addUncle("Mang Agus");
	   family.addUncle("Mang Engkus");
	   
	   //find uncle
	   Uncle uncle = family.findUncle("Mang Agus");
	   Uncle uncle1 = family.findUncle("Mang Engkus");
	   if(family.findUncle("") != null) System.out.println("Paman tidak ditemukan");
	   
	   //add hadiah
	   uncle.addPresent(family.findNiece("Salman"), "Laptop");
	   family.addNiece("Siti", 1, 10);
	   
	   //cek hadiah dari paman
	   uncle.addPresent(family.findNiece("Akbar"), "Jabatan");
	   uncle.addPresent(family.findNiece("Siti"), "Jabatan");
	   
	   //cek 2 paman memberi hadiah yang sama
	   uncle1.addPresent(family.findNiece("Akbar"), "Jabatan");
	   
	   //list sepupu dan hadiahnya
	   System.out.println("___________________________________________________");
	   System.out.println("Nama Sepupu beserta ulang tahun nya :");
	   family.listNieces();
	   System.out.println("Nama Paman :");
	   family.listUncles();
	   uncle.listPresents();
	   family.findNiece("Salman").listPresents();
	   family.findNiece("Akbar").listPresents();
   }
}
