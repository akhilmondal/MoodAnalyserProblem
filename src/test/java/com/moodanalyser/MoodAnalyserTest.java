package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {


    @Test
    public void AnalyseMoodMethodWillReturnSad() {
        MoodAnalyserProblem moodAnalyserProblem1 = new MoodAnalyserProblem("i am in sad mood");
        Assert.assertEquals(true,moodAnalyserProblem1.analyseMood());
    }
    //bellow test case will pass when result will be fasle or not sad.
    @Test
    public void AnalyseMoodMethodWillReturnHappy() {
        MoodAnalyserProblem moodAnalyserProblem2 = new MoodAnalyserProblem("i am in any mood");
        Assert.assertEquals(false,moodAnalyserProblem2.analyseMood());
    }
}
