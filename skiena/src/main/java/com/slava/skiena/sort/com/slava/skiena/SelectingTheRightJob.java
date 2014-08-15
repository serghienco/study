package com.slava.skiena.sort.com.slava.skiena;

import com.google.common.base.Preconditions;

import java.util.List;

/**
 * Created by vserghienco on 8/14/14.
 */
public class SelectingTheRightJob {

    public static class Job {
        private String name;
        private long start;
        private long end;

        public Job(String name, long start, long end) {
            Preconditions.checkArgument(start < end);
            this.name = name;
            this.start = start;
            this.end = end;
        }
    }

    public static List<Job> getTheRightJobs(List<Job> jobs) {
        return jobs;
    }
}
