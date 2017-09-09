package com.hiwotab.roboresumeapplication.repository;

import com.hiwotab.roboresumeapplication.model.EduAchievements;
import com.hiwotab.roboresumeapplication.model.Job;
import com.hiwotab.roboresumeapplication.model.Resume;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface JobRepository extends CrudRepository<Job,Long> {
    Set<Job> findByResume(Resume resume);
}

