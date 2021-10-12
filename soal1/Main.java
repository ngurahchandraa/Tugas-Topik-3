package soal1;

public class Main {
    public static void main(String[] args){

        Jurusan d3rpla = new Jurusan("D3RPLA" , "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan d3si = new Jurusan("D3SI" , "Diploma 3 Sistem Informasi");

        Mahasiswa rendi = new Mahasiswa("6701" , "Rendi");
        Mahasiswa chaca = new Mahasiswa("6702" , "Chaca");
        Mahasiswa agus = new Mahasiswa("6703" , "Agus");

        d3rpla.addMhs(rendi);
        d3rpla.addMhs(chaca);
        d3rpla.addMhs(agus);

        Mahasiswa ridwan = new Mahasiswa("6301" , "Ridwan");
        Mahasiswa siska = new Mahasiswa("6302" , "Siska");
        Mahasiswa zayn = new Mahasiswa("6303" , "Zayn");
        Mahasiswa rahmat = new Mahasiswa("6304" , "Rahmat");

        d3si.addMhs(ridwan);
        d3si.addMhs(siska);
        d3si.addMhs(zayn);
        d3si.addMhs(rahmat);

        System.out.println("Kode: " + d3rpla.getKode());
        System.out.println("Kode: " + d3rpla.getNama());
        System.out.println("Daftar Mahasiswa: ");

        int nomorRPLA = 1;
        for (Mahasiswa mahasiswa : d3rpla.getMahasiswa()) {
            System.out.println(nomorRPLA++ + ". " + mahasiswa.getNim() + " - " + mahasiswa.getNama());
        }
        System.out.println();

        System.out.println("Kode: " + d3si.getKode());
        System.out.println("Kode: " + d3si.getNama());
        System.out.println("Daftar Mahasiswa: ");

        int nomorSi = 1;
        for (Mahasiswa mahasiswa : d3si.getMahasiswa()) {
            System.out.println(nomorSi++ + ". " + mahasiswa.getNim() + " - " + mahasiswa.getNama());
        }
    }
}
