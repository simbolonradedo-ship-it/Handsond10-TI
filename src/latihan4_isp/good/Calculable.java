package latihan4_isp.good;

/**
 * Capability: Melakukan kalkulasi (untuk spreadsheet)
 * Hanya Spreadsheet yang mengimplementasikan ini
 */
public interface Calculable {
    /**
     * Calculate formula (example: "SUM(A1:A10)")
     *
     * @param formula Formula to calculate
     */
    void calculate(String formula);
}
