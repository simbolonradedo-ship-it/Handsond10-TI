package latihan4_isp.good;

/**
 * PdfDocument hanya implement Readable dan Printable
 */
public class PdfDocument implements Readable, Printable {
    private String filename;

    public PdfDocument(String filename) {
        this.filename = filename;
    }

    @Override
    public void read() {
        System.out.println("[PdfDocument] Reading PDF: " + filename);
    }

    @Override
    public void print() {
        System.out.println("[PdfDocument] Printing PDF: " + filename);
    }
}
