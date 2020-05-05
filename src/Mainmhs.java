public class Mainmhs {
    public static void main(String[] args) {
        mhs m= new mhs();

        m.setNama("Muhammad Reza Naury");
        m.setNpm("18630402") ;
        m.setKelas("4-C TI Banjarbaru");
        m.setMatakuliah("PBO Tugas 5");
        m.setDosen("Mirza Yogi Kurniayawan");

        System.out.println("Nama : "+ m.getNama());
        System.out.println("Npm : "+ m.getNpm());
        System.out.println("Kelas : "+ m.getKelas());
        System.out.println("Mata Kuliah : "+ m.getMatakuliah());
        System.out.println("Dosen : "+ m.getDosen());
    }
}
