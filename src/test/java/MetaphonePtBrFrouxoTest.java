package mtfn;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class MetaphonePtBrFrouxoTest {

    @Test
    public void testBasic() throws Exception {
        assertMetaphoneEquals("KL", "Carlos");
        assertMetaphoneEquals("ARJ", "Araújo");
        assertMetaphoneEquals("ALSD", "Alexandre");
        assertMetaphoneEquals("ALSD", "Alessandro");
        assertMetaphoneEquals("IFJN", "Efigênia");
        assertMetaphoneEquals("IFJN", "Ifigênia");
        assertMetaphoneEquals("IFJN", "Hefigênia");
        assertMetaphoneEquals("RS", "Rochel");
        assertMetaphoneEquals("MSR", "Maeshiro");
        assertMetaphoneEquals("ABT", "Abbate");
        assertMetaphoneEquals("ASS", "Assunção");
        assertMetaphoneEquals("ASS", "Assuncao");
        assertMetaphoneEquals("BBS", "Barbosa");
        assertMetaphoneEquals("BBS", "Barboza");
        
    }

    private void assertMetaphoneEquals(String expected, String original) {
        assertEquals("Metaphone", expected, new MetaphonePtBrFrouxo(original).toString());
    }
}
