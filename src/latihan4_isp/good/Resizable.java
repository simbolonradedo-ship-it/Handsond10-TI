package latihan4_isp.good;

/**
 * Capability: Mengubah ukuran (untuk image)
 * Hanya Image yang mengimplementasikan ini
 */
public interface Resizable {
    /**
     * Resize image/document
     *
     * @param width  new width
     * @param height new height
     */
    void resize(int width, int height);
}
