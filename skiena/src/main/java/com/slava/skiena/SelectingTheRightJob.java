package com.slava.skiena;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by vserghienco on 8/14/14.
 */
public class SelectingTheRightJob {

    public static List<Job> getTheRightJobs(List<Job> jobs) {
        List<Job> list = Lists.newArrayList(jobs);
        Collections.sort(list, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                long result = o1.end - o2.end;
                return result > 0 ? 1 : result < 0 ? -1 : 0;
            }
        });

        List<Job> rightJobs = Lists.newArrayList();
        Job rightJob = list.get(0);
        rightJobs.add(rightJob);
        for (int i = 1; i < list.size(); i++) {
            Job job = list.get(i);
            if (job.start > rightJob.end) {
                rightJob = job;
                rightJobs.add(rightJob);
            }
        }
        return rightJobs;
    }

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

        @Override
        public String toString() {
            return name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Job) {
                return name.equals(((Job) obj).name);
            }
            return false;
        }
    }
}
