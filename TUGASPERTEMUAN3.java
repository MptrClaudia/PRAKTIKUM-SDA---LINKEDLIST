import java.util.LinkedList;

//Diketahui nama saya lengkap dengan spasi adalah sebuah LinkedList (MAHAPUTRI CLAUDIA FERNANDO)

public class TUGASPERTEMUAN3 {
    public static void main(String[] args) {
        LinkedList<String> nama = new LinkedList<String>();

        nama.add("M");
        nama.add("A");
        nama.add("H");
        nama.add("A");
        nama.add("P");
        nama.add("U");
        nama.add("T");
        nama.add("R");
        nama.add("I");
        nama.add(" ");
        nama.add("C");
        nama.add("L");
        nama.add("A");
        nama.add("U");
        nama.add("D");
        nama.add("I");
        nama.add("A");
        nama.add(" ");
        nama.add("F");
        nama.add("E");
        nama.add("R");
        nama.add("N");
        nama.add("A");
        nama.add("N");
        nama.add("D");
        nama.add("O");

        System.out.println("Nama Lengkap\t: "+ nama);
        
//1. add karakter lain yang anda inginkan
        nama.addFirst("Prof");
        nama.addLast("Ph.D");

        System.out.println("1. Output add karakter baru\t: "+ nama);

//2. sisipkan karakter lain yang anda inginkan
        nama.set(9,"A");
        nama.set(17,"O");

        System.out.println("2. Output sisip karakter\t: "+ nama);

//3. hapus beberapa karakter yang anda inginkan
        nama.remove(5);
        nama.remove(10);
        nama.remove(15);
        nama.remove(20);

        System.out.println("3. Output remove karakter\t: "+ nama);

//4. buat fungsi POP dan PUSH pada project anda
        nama.pop();
        System.out.println("4. Output POP\t: "+ nama);

        nama.push("I");
        System.out.println("5. Output PUSH\t: "+  nama);
    }

}

