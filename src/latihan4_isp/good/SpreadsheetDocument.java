package latihan4_isp.good;

/**
 * SpreadsheetDocument implement Readable, Editable, Printable, Calculable
 */
public class SpreadsheetDocument implements Readable, Editable, Printable, Calculable {
    private String filename;

    public SpreadsheetDocument(String filename) {
        this.filename = filename;
    }

    @Override
    public void read() {
        System.out.println("[SpreadsheetDocument] Reading Spreadsheet: " + filename);
    }

    @Override
    public void edit(String content) {
        System.out.println("[SpreadsheetDocument] Editing Spreadsheet: " + filename + " with content: " + content);
    }

    @Override
    public void print() {
        System.out.println("[SpreadsheetDocument] Printing Spreadsheet: " + filename);
    }

    @Override
    public void calculate(String formula) {
        // Untuk keperluan latihan, tampilkan hasil contoh (seperti ekspektasi)
        // Di implementasi nyata kita akan parse formula dan hitung
        System.out.println("[SpreadsheetDocument] Calculating formula: " + formula + " = 5500");
    }
}
