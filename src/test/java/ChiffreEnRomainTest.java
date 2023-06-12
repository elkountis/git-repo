import org.junit.jupiter.api.Test;

public class ChiffreEnRomainTest {
    @Test
    public  void convert_1_to_1 ()
    {
        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(1)).equals("I");
    }

    @Test
    public  void convert_2_to_II ()
    {
        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(2)).equals("II");

    }
    @Test
    public  void convert_3_to_III ()
    {

        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(3)).equals("III");
    }
    @Test
    public  void convert_5_to_V ()
    {

        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(5)).equals("V");
    }

    @Test
    public  void convert_7_to_VII ()
    {

        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(7)).equals("VII");
    }

    @Test
    public  void convert_10_to_X ()
    {

        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(10)).equals("X");
    }

    @Test
    public  void convert_12_to_XII ()
    {

        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(12)).equals("XII");
    }
    @Test
    public  void convert_33_to_XXXIII ()
    {

        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(33)).equals("XXXIII");
    }

    @Test
    public  void convert_40_to_IX ()
    {

        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(40)).equals("XL");
    }
    @Test
    public  void convert_44_to_XLIV ()
    {

        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(44)).equals("XLIV");
    }
    @Test
    public  void convert_90_to_XC ()
    {

        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(90)).equals("XC");
    }
    @Test
    public  void convert_999_to_CMXCIX ()
    {

        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(999)).equals("CMXCIX");
    }
    @Test
    public  void convert_2949_to_MMCMXLIX ()
    {

        ChiffreEnRomain chiffreEnRomain = new ChiffreEnRomain();
        assert(chiffreEnRomain.convertNumbToRomain(2949)).equals("MMCMXLIX");
    }


}
