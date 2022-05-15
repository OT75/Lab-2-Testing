import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {

    MinMax x;

    @BeforeEach

    public void init (){
        x = new MinMax()  ;
    }
    @Nested
    public class Check{
        @Test
        public void CheckPositiveMax(){
            x.setArr(new int[]{1,2,3,6,234,525,6346,0,12});
            assertEquals(6346,x.Max());
        }
        @Test
        public void CheckNegativeMax(){
            x.setArr(new int[]{-200,-3,-23,-12,-10,-2,-1,-7,-8});
            assertEquals(-1,x.Max());
        }
        @Test
        public void CheckMaxPosAndNg(){
            x.setArr(new int[]{1,-1,35,122,-85,-8,110,21,-82,140});
            assertEquals(140,x.Max());
        }
        @Test
        public void CheckPositiveMin(){
            x.setArr(new int[]{500,5,1,8,61,9,72,84,7});
            assertEquals(1,x.Min());
        }
        @Test
        public void CheckNegativeMin(){
            x.setArr(new int[]{-1,-5,-84,-5,-7,-50,-142});
            assertEquals(-142,x.Min());
        }
        @Test
        public void CheckMinPosAndNeg(){
            x.setArr(new int[]{0,515,8,-4,-89,562,1,-17,-18});
            assertEquals(-89,x.Min());
        }
    }

    @AfterEach
    public void cleanUp(){
        x=null;
    }

}