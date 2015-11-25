import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by saylik on 25/11/15.
 */
public class GuideTest {

    @Test
    public void guideShouldTranslateTheNumberOfOtherGalaxy(){
        Guide guide = new Guide();
        assertEquals(guide.translate("pish tegj glob glob"),42);
    }


}
