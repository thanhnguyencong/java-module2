package TDDD.TriangleClassifier;

import org.junit.jupiter.api.DisplayName;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {
    @Test
    @DisplayName("test khong phai tam giac")
    public void testNotTriangle(){
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "khong phai tam giac";
        String result = TriangleClassifier.size(0,1,1);
        assertEquals(expected,result);
    }
}