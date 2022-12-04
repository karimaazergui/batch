package com.example.batchtp.controller;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;

    @GetMapping("/laoder")
    public void load(){
        JobParameters jobParameters=new JobParametersBuilder()
                .addLong("startAt",System.currentTimeMillis()).toJobParameters();
        try{
            jobLauncher.run(job,jobParameters);
        }catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException | JobParametersInvalidException e){
            e.printStackTrace();
        }

    }
/*
    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;



        @RequestMapping("/jobLauncher")
        public void handle() throws Exception{
            jobLauncher.run(job, new JobParameters());
        }

         @GetMapping("/importTransaction")
    public void importCsvToJob() {
        JobParameters jobParameters = new JobParametersBuilder()
                .addLong("startAt", System.currentTimeMillis()).toJobParameters();
        try {
            jobLauncher.run(job, jobParameters);
        } catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException |
                 JobParametersInvalidException e) {
            e.printStackTrace();
        }




    @PostMapping("/importTransaction")
    public void importCsvToJob(){
        JobParameters jobParameters=new JobParametersBuilder()
        .addLong("startAt",System.currentTimeMillis()).toJobParameters();
        try{
           jobLauncher.run(job,jobParameters);
        }catch (JobExecutionAlreadyRunningException | JobRestartException| JobInstanceAlreadyCompleteException|JobParametersInvalidException e){
             e.printStackTrace();
        }

    }*/

    }
