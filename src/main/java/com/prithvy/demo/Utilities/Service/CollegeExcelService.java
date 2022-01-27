package com.prithvy.demo.Utilities.Service;


import com.prithvy.demo.Utilities.ModelUtils.CollegeExcelUtilities;
import com.prithvy.demo.model.AgriCollege;
import com.prithvy.demo.model.ArtsCollege;
import com.prithvy.demo.model.EngineeringCollege;
import com.prithvy.demo.Utilities.GeneralModel.College;
import com.prithvy.demo.model.MedicalCollege;
import com.prithvy.demo.repository.AgriCollegeRepository;
import com.prithvy.demo.repository.ArtsCollegeRepository;
import com.prithvy.demo.repository.EngineeringCollegeRepository;
import com.prithvy.demo.repository.MedicalCollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CollegeExcelService {
    public CollegeExcelService() {
    }

    public CollegeExcelService(ArtsCollegeRepository artsCollegeRepository, AgriCollegeRepository agriCollegeRepository, MedicalCollegeRepository medicalCollegeRepository, EngineeringCollegeRepository engineeringCollegeRepository) {
        this.artsCollegeRepository = artsCollegeRepository;
        this.agriCollegeRepository = agriCollegeRepository;
        this.medicalCollegeRepository = medicalCollegeRepository;
        this.engineeringCollegeRepository = engineeringCollegeRepository;
    }

    @Autowired
    public ArtsCollegeRepository artsCollegeRepository;

    @Autowired
    public AgriCollegeRepository agriCollegeRepository;

    @Autowired
    public MedicalCollegeRepository medicalCollegeRepository;

    @Autowired
    public EngineeringCollegeRepository engineeringCollegeRepository;

    public void store(MultipartFile file, int collegeCode) {
        if (collegeCode == 1) {
            try {
                List<College> lstCustomers = CollegeExcelUtilities.parseExcelFile(file.getInputStream());
                List<EngineeringCollege> lst = new ArrayList<>();

                for (College college : lstCustomers) {
                    EngineeringCollege engineeringCollege = new EngineeringCollege();
                    engineeringCollege.setId(college.getId());
                    engineeringCollege.setCollegename(college.getCollegename());
                    engineeringCollege.setDetails(college.getDetails());
                    engineeringCollege.setDistrict(college.getDistrict());
                    lst.add(engineeringCollege);
                }
                // Save Customers to DataBase
                engineeringCollegeRepository.saveAll(lst);
            } catch (IOException e) {
                throw new RuntimeException("FAIL! -> message = " + e.getMessage());
            }
        } else if (collegeCode == 2) {
            try {
                List<College> lstCustomers = CollegeExcelUtilities.parseExcelFile(file.getInputStream());
                List<ArtsCollege> lst = new ArrayList<>();
                for (College college : lstCustomers) {
                    ArtsCollege artsCollege = new ArtsCollege();
                    artsCollege.setId(college.getId());
                    artsCollege.setCollegename(college.getCollegename());
                    artsCollege.setDetails(college.getDetails());
                    artsCollege.setDistrict(college.getDistrict());
                    lst.add(artsCollege);
                }
                // Save Customers to DataBase
                artsCollegeRepository.saveAll(lst);
            } catch (IOException e) {
                throw new RuntimeException("FAIL! -> message = " + e.getMessage());
            }
        } else if (collegeCode == 3) {
            try {
                List<College> lstCustomers = CollegeExcelUtilities.parseExcelFile(file.getInputStream());
                ArrayList<MedicalCollege> lst = new ArrayList<MedicalCollege>();
                // Save Customers to DataBase
                for (College college : lstCustomers) {
                    MedicalCollege medicalCollege = new MedicalCollege();
                    medicalCollege.setId(college.getId());
                    medicalCollege.setCollegename(college.getCollegename());
                    medicalCollege.setDetails(college.getDetails());
                    medicalCollege.setDistrict(college.getDistrict());
                    lst.add(medicalCollege);
                }
                medicalCollegeRepository.saveAll(lst);
            } catch (IOException e) {
                throw new RuntimeException("FAIL! -> message = " + e.getMessage());
            }
        } else if (collegeCode == 4) {
            try {
                List<College> lstCustomers = CollegeExcelUtilities.parseExcelFile(file.getInputStream());
                List<AgriCollege> lst = new ArrayList<>();

                for (College college : lstCustomers) {
                    AgriCollege agriCollege = new AgriCollege();
                    agriCollege.setId(college.getId());
                    agriCollege.setCollegename(college.getCollegename());
                    agriCollege.setDetails(college.getDetails());
                    agriCollege.setDistrict(college.getDistrict());
                    lst.add(agriCollege);
                }
                // Save Customers to DataBase
                agriCollegeRepository.saveAll(lst);
            } catch (IOException e) {
                throw new RuntimeException("FAIL! -> message = " + e.getMessage());
            }
        }
    }

//    // Load Data to Excel File
//    public ByteArrayInputStream loadFile() {
//        List<College> customers = (List<College>) repo.findAll();
//
//        try {
//            return CollegeExcelUtilities.collegesToExcel(customers);
//        } catch (IOException e) {}
//
//        return null;
//    }
}
