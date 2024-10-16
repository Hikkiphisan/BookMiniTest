import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProgrammingBook[] programmingBooks = new ProgrammingBook[3];
        programmingBooks[0] = new ProgrammingBook(23,"Nhập môn Java theo cách trực quan",380.000,"Kathy iera","java","Spring Framework");
        programmingBooks[1] = new ProgrammingBook(55," C++: Hướng dẫn cho người mới bắt đầu",350.680," Herbert Schildt","C++","Play Framework");
        programmingBooks[2] = new ProgrammingBook(232,"Java dành cho người mới bắt đầu",480.680,"Barry A. Burd","java","JHipster");

        FictionBook[] fictionBooks = new FictionBook[3];
        fictionBooks[0] = new FictionBook(2342,"Cỗ máy thời gian",231.000,"H.G.Wells","Viễn tưởng 1");
        fictionBooks[1] = new FictionBook(534,"Tam The",431.000,"Luu Tu Han","Light Novel");
        fictionBooks[2] = new FictionBook(15,"Harry Porter",416.000,"J.K.Rowling","Fantasy");
        double sum = 0;
        for (ProgrammingBook book : programmingBooks) {
            sum += book.getPrice();
        }
        for (FictionBook book : fictionBooks) {
            sum += book.getPrice();
        }
        System.out.printf("Tổng tiền cua 6 cuon sach: %.3f dong\n ", sum);


        System.out.print("Số lượng cuốn sách phần mềm có ngôn ngữ là Java: ");
        int countProgramBookJava = 0;
        for (ProgrammingBook bookJava : programmingBooks) {
            if (bookJava.getLanguage() == "java") {
                countProgramBookJava++;
            }
        }
        System.out.println(countProgramBookJava +" quyển");

        System.out.print("Số lượng cuốn sách vien tuong có thể loại là viễn tưởng 1: ");
        int countFIctionBookcallVienTuong1 = 0;
        for (FictionBook bookVienTuong1 : fictionBooks) {
            if (bookVienTuong1.getCategory() == "Viễn tưởng 1") {
                countFIctionBookcallVienTuong1++;
            }
        }
        System.out.println(countFIctionBookcallVienTuong1+" quyển" );

        System.out.print("May quyen viễn tưởng co gia duoi 300.000 dong: ");
        int countfictionBooksUnder300k = 0;
        for (FictionBook bookFiction : fictionBooks) {
            if (bookFiction.getPrice() < 300.000) {
                countfictionBooksUnder300k++;
            }
        }
        System.out.println(countfictionBooksUnder300k +" quyển");
    }
}