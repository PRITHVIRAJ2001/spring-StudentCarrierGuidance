package com.prithvy.demo.Utilities.Service;


import com.prithvy.demo.Utilities.ModelUtils.JobExcelUtilities;
import com.prithvy.demo.model.AgriJobs;
import com.prithvy.demo.model.ArtsJobs;
import com.prithvy.demo.model.EngineeringJobs;
import com.prithvy.demo.Utilities.GeneralModel.Jobs;
import com.prithvy.demo.model.MedicalJobs;
import com.prithvy.demo.repository.AgriJobsRepository;
import com.prithvy.demo.repository.ArtsJobsRepository;
import com.prithvy.demo.repository.EngineeringJobsRepository;
import com.prithvy.demo.repository.MedicalJobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class JobExcelService {

    @Autowired
    public ArtsJobsRepository artsJobsRepository;

    @Autowired
    public AgriJobsRepository agriJobsRepository;

    @Autowired
    public MedicalJobsRepository medicalJobsRepository;

    @Autowired
    public EngineeringJobsRepository engineeringJobsRepository;

    public JobExcelService(ArtsJobsRepository artsJobsRepository, AgriJobsRepository agriJobsRepository, MedicalJobsRepository medicalJobsRepository, EngineeringJobsRepository engineeringJobsRepository) {
        this.artsJobsRepository = artsJobsRepository;
        this.agriJobsRepository = agriJobsRepository;
        this.medicalJobsRepository = medicalJobsRepository;
        this.engineeringJobsRepository = engineeringJobsRepository;
    }

    public JobExcelService() {
    }

    public void store(MultipartFile file, int collegeType) {
        if (collegeType == 1) {
            try {
                List<Jobs> lstCustomers = JobExcelUtilities.parseExcelFile(file.getInputStream());
                List<EngineeringJobs> lst = new ArrayList<>();
                for (Jobs jobs : lstCustomers) {
                    EngineeringJobs engineeringJobs = new EngineeringJobs();
                    engineeringJobs.setId(jobs.getId());
                    engineeringJobs.setJob(jobs.getJob());
                    engineeringJobs.setCourseId(jobs.getCourseId());
                    lst.add(engineeringJobs);
                }
                // Save Customers to DataBase
                engineeringJobsRepository.saveAll(lst);
            } catch (IOException e) {
                throw new RuntimeException("FAIL! -> message = " + e.getMessage());
            }
        } else if (collegeType == 2) {
            try {
                List<Jobs> lstCustomers = JobExcelUtilities.parseExcelFile(file.getInputStream());
                List<ArtsJobs> lst = new ArrayList<>();
                for (Jobs jobs : lstCustomers) {
                    ArtsJobs artsJobs = new ArtsJobs();
                    artsJobs.setId(jobs.getId());
                    artsJobs.setJob(jobs.getJob());
                    artsJobs.setCourseId(jobs.getCourseId());
                    lst.add(artsJobs);
                }
                // Save Customers to DataBase
                artsJobsRepository.saveAll(lst);
            } catch (IOException e) {
                throw new RuntimeException("FAIL! -> message = " + e.getMessage());
            }
        } else if (collegeType == 3) {
            try {
                List<Jobs> lstCustomers = JobExcelUtilities.parseExcelFile(file.getInputStream());
                List<MedicalJobs> lst = new ArrayList<>();
                for (Jobs jobs : lstCustomers) {
                    MedicalJobs medicalJobs = new MedicalJobs();
                    medicalJobs.setId(jobs.getId());
                    medicalJobs.setJob(jobs.getJob());
                    medicalJobs.setCourseId(jobs.getCourseId());
                    lst.add(medicalJobs);
                }
                // Save Customers to DataBase
                medicalJobsRepository.saveAll(lst);
            } catch (IOException e) {
                throw new RuntimeException("FAIL! -> message = " + e.getMessage());
            }
        } else if (collegeType == 4) {
            try {
                List<Jobs> lstCustomers = JobExcelUtilities.parseExcelFile(file.getInputStream());
                List<AgriJobs> lst = new ArrayList<>();
                for (Jobs jobs : lstCustomers) {
                    AgriJobs agriJobs = new AgriJobs();
                    agriJobs.setId(jobs.getId());
                    agriJobs.setJob(jobs.getJob());
                    agriJobs.setCourseId(jobs.getCourseId());
                    lst.add(agriJobs);
                }
                // Save Customers to DataBase
                agriJobsRepository.saveAll(lst);
            } catch (IOException e) {
                throw new RuntimeException("FAIL! -> message = " + e.getMessage());
            }
        }
    }
//
//    // Load Data to Excel File
//    public ByteArrayInputStream loadFile() {
//        List<Jobs> customers = (List<Jobs>) repo.findAll();
//
//        try {
//            return JobExcelUtilities.jobsToExcel(customers);
//        } catch (IOException e) {}
//
//        return null;
//    }
}
