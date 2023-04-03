package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {


    @Test
    public void AnalyseMoodMethodWillReturnSad() {
        MoodAnalyserProblem moodAnalyserProblem = new MoodAnalyserProblem();
        Assert.assertEquals(true,moodAnalyserProblem.analyseMood("i am in sad mood"));

    }
}
