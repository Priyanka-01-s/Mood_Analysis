import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.mood.MoodAnalysis;

public class MoodAnalysisTest {

    @Test
    public void testAnalysis(){

        String message = "I am in a sad mood.";

        MoodAnalysis moodAnalysis = new MoodAnalysis(message);

        String result = moodAnalysis.happySadAnalysis();

        assertEquals("SAD", result);
    }
    
}
