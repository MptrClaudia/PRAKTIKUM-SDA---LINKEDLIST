import java.util.LinkedList;

//Buatlah sebuah LinkedList yang mana pada LinkedList tersebut dapat menambah data berupa No_Bp, Nama_Mahasiswa, Alamat.
//Kemudian Tambahkan beberapa fungsi/operasi pada LinkedList yang anda ketahui
public class tugaspertemuan4 {
    public static void main(String[] args) {
        
        System.out.println("=====FUNGSI-FUNGSI PADA LINKEDLIST=====");
        System.out.println("");

        //1.create LinkedList
        LinkedList<String> No_NIM = new LinkedList<>();
        LinkedList<String> Nama_Mahasiswa = new LinkedList<>();
        LinkedList<String> Alamat = new LinkedList<>();

        //2. add() 
        No_NIM.add("2111527003");
        Nama_Mahasiswa.add("Mahaputri Claudia Fernando");
        Alamat.add("Korea Selatan");

        No_NIM.add("2111522222");
        Nama_Mahasiswa.add("Claude Vergio");
        Alamat.add("Australia");

        No_NIM.add("2111523333");
        Nama_Mahasiswa.add("Zafran Fernandez");
        Alamat.add("Amerika");

        No_NIM.add("2111524444");
        Nama_Mahasiswa.add("Chiko Adnan");
        Alamat.add("Indonesia");


        System.out.println("1. Add LINKEDLIST");
        System.out.println("NIM\t\t: "+No_NIM);
        System.out.println("Nama Lengkap \t: "+Nama_Mahasiswa);
        System.out.println("Alamat\t\t: "+Alamat);
        System.out.println("");

        //3. size()
        System.out.println("2. Size LINKEDLIST");
        System.out.println("NIM\t\t: "+No_NIM.size());
        System.out.println("Nama Lengkap \t: "+Nama_Mahasiswa.size());
        System.out.println("Alamat\t\t: "+Alamat.size());
        System.out.println("");

        //4. is Empty()
        System.out.println("3. Empty LINKEDLIST");
        System.out.println("NIM\t\t: "+No_NIM.isEmpty());
        System.out.println("Nama lengkap \t: "+Nama_Mahasiswa.isEmpty());
        System.out.println("Alamat\t\t: "+Alamat.isEmpty());
        System.out.println("");

        //5. set()
        No_NIM.set(3, "2111525555");
        Nama_Mahasiswa.set(2, "Xavier Syavina");
        Alamat.set(1,"Hawaii");

        System.out.println("4. Set LINKEDLIST");
        System.out.println("NIM\t\t: "+No_NIM);
        System.out.println("Nama Lengkap \t: "+Nama_Mahasiswa);
        System.out.println("Alamat\t\t: "+Alamat);
        System.out.println("");

        //6. remove()
        No_NIM.remove(2);
        Nama_Mahasiswa.remove(2);
        Alamat.remove(1);

        System.out.println("5. Remove LINKEDLIST");
        System.out.println("NIM\t\t: "+No_NIM);
        System.out.println("Nama Lengkap \t: "+Nama_Mahasiswa);
        System.out.println("Alamat\t\t: "+Alamat);
        System.out.println("");

        //7. get()
        System.out.println("6. Get LINKEDLIST");
        System.out.println("NIM\t\t: "+No_NIM.get(0));
        System.out.println("Nama Lengkap \t: "+Nama_Mahasiswa.get(0));
        System.out.println("Alamat\t\t: "+Alamat.get(0));
        System.out.println("");

        //8. indexOf()
        System.out.println("7. IndexOf LINKEDLIST");
        System.out.println("NIM\t\t: "+No_NIM.indexOf("2111527003"));
        System.out.println("Nama Lengkap \t: "+Nama_Mahasiswa.indexOf("Xavier Syavina"));
        System.out.println("Alamat\t\t: "+Alamat.indexOf("Indonesia"));
        System.out.println("");

        //9. pop()
        No_NIM.pop();
        Nama_Mahasiswa.pop();
        Alamat.pop();

        System.out.println("8. Pop LINKEDLIST");
        System.out.println("NIM\t\t: "+No_NIM);
        System.out.println("Nama Lengkap \t: "+Nama_Mahasiswa);
        System.out.println("Alamat\t\t: "+Alamat);
        System.out.println("");

        //10. push()
        No_NIM.push("211156666");
        Nama_Mahasiswa.push("Roxanne Lalisa");
        Alamat.push("Italia");

        System.out.println("9. Push LINKEDLIST");
        System.out.println("NIM\t\t: "+No_NIM);
        System.out.println("Nama Lengkap \t: "+Nama_Mahasiswa);
        System.out.println("Alamat\t\t: "+Alamat);
        System.out.println("");

    }
}