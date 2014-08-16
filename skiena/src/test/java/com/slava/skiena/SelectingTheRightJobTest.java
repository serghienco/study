package com.slava.skiena;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by vserghienco on 8/14/14.
 */
public class SelectingTheRightJobTest {

    @Test
    public void testGetTheRightJobs() throws Exception {
        List<SelectingTheRightJob.Job> jobs = Lists.newArrayList(
                new SelectingTheRightJob.Job("The President's Algorist", 1, 20),
                new SelectingTheRightJob.Job("Discrete Mathematics", 3, 15),
                new SelectingTheRightJob.Job("Tarjan ot the Jungle", 7, 24),
                new SelectingTheRightJob.Job("Halting State", 19, 29),
                new SelectingTheRightJob.Job("Steiner's Tree", 22, 33),
                new SelectingTheRightJob.Job("The Four Volume Problem", 31, 51),
                new SelectingTheRightJob.Job("Programming Challenges", 35, 47),
                new SelectingTheRightJob.Job("Process Terminated", 44, 64),
                new SelectingTheRightJob.Job("Calculated Bets", 50, 65)
        );

        List<SelectingTheRightJob.Job> expectedJobs = Lists.newArrayList(
                new SelectingTheRightJob.Job("Discrete Mathematics", 3, 15),
                new SelectingTheRightJob.Job("Halting State", 19, 29),
                new SelectingTheRightJob.Job("Programming Challenges", 35, 47),
                new SelectingTheRightJob.Job("Calculated Bets", 50, 65)
        );

        jobs = SelectingTheRightJob.getTheRightJobs(jobs);

        Assert.assertArrayEquals(expectedJobs.toArray(), jobs.toArray());
    }
}
