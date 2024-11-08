import java.util.Scanner;

public class AverageValue14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int j,i;
        float totalNilai,nilaiMhs;
        float rataNilai;

        i=1;
        while (i <= 5) {
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" +j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata - rata nilai mahasiswa " + i + " adalah "  + rataNilai);
            i++;
        }
    }
}