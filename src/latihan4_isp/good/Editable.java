package latihan4_isp.good;

/**
 * Capability: Mengedit dokumen
 * Hanya Word dan Spreadsheet yang mengimplementasikan ini
 */
public interface Editable {
    /**
     * Edit document content
     *
     * @param content New content to write
     */
    void edit(String content);
}
