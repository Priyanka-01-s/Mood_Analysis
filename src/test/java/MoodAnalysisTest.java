import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.mood.MoodAnalysis;
import com.mood.MoodAnalysisError;

import com.mood.MoodAnalysisException;

public class MoodAnalysisTest {

    @Test
    public void testAnalysis(){

        String message = "I am in a happy mood.";
        MoodAnalysis moodAnalysis = new MoodAnalysis(message);
        // String result = moodAnalysis.happySadAnalysis();
        // assertEquals("HAPPY", result);
        try {
        String result = moodAnalysis.happySadAnalysis();
        assertEquals("HAPPY", result);
    } catch (MoodAnalysisException e) {
        e.printStackTrace();  // Print the exception details
        fail("Unexpected exception: " + e.getMessage());
    }
    }
    
    @Test
    public void testSadAnalysis() {
        String message = "I am in a sad mood.";
        MoodAnalysis moodAnalysis = new MoodAnalysis(message);
        //String result = moodAnalysis.happySadAnalysis();
        //assertEquals("SAD", result);
        try {
            String result = moodAnalysis.happySadAnalysis();
            assertEquals("SAD", result);
        } catch (MoodAnalysisException e) {
            // Handle the exception if needed
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testNullMood() {
        String message = null;
        MoodAnalysis moodAnalysis = new MoodAnalysis(message);
        // Use assertThrows to check if MoodAnalysisException is thrown
        MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, () -> {
            moodAnalysis.happySadAnalysis();
        });
        assertEquals(MoodAnalysisError.EMPTY_MOOD, exception.getError());
        assertEquals("Mood should not be empty or null", exception.getMessage());
    }

    @Test
    public void testEmptyMood() {
        String message = "";  // Empty mood
        MoodAnalysis moodAnalysis = new MoodAnalysis(message);

        MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, () -> {
            moodAnalysis.happySadAnalysis();
        });

        assertEquals(MoodAnalysisError.EMPTY_MOOD, exception.getError());
        assertEquals("Mood should not be empty or null", exception.getMessage());
    }

    
}


