package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {


    @Test
    public void AnalyseMoodMethodWillReturnSad() {
        MoodAnalyserProblem moodAnalyserProblem = new MoodAnalyserProblem();
        Assert.assertEquals(true,moodAnalyserProblem.analyseMood("i am in sad mood"));
    }
    //bellow test case will pass when result will be fasle or not sad.
    @Test
    public void AnalyseMoodMethodWillReturnHappy() {
        MoodAnalyserProblem moodAnalyserProblem = new MoodAnalyserProblem();
        Assert.assertEquals(false,moodAnalyserProblem.analyseMood("i am in any mood"));
    }
}
