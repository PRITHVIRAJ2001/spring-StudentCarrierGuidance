package com.prithvy.demo.Utilities.Service;


import com.prithvy.demo.Utilities.ModelUtils.CoursesExcelUtilities;
import com.prithvy.demo.model.AgriCourses;
import com.prithvy.demo.model.ArtsCourses;
import com.prithvy.demo.model.EngineeringCourses;
import com.prithvy.demo.Utilities.GeneralModel.Courses;
import com.prithvy.demo.model.MedicalCourses;
import com.prithvy.demo.repository.AgriCoursesRepository;
import com.prithvy.demo.repository.ArtsCourseRepository;
import com.prithvy.demo.repository.EngineeringCourseRepository;
import com.prithvy.demo.repository.MedicalCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class CourseExcelService {

    @Autowired
    public ArtsCourseRepository artsCourseRepository;

    @Autowired
    public AgriCoursesRepository agriCoursesRepository;

    @Autowired
    public MedicalCoursesRepository medicalCoursesRepository;

    public CourseExcelService(ArtsCourseRepository artsCourseRepository, AgriCoursesRepository agriCoursesRepository, MedicalCoursesRepository medicalCoursesRepository, EngineeringCourseRepository engineeringCourseRepository) {
        this.artsCourseRepository = artsCourseRepository;
        this.agriCoursesRepository = agriCoursesRepository;
        this.medicalCoursesRepository = medicalCoursesRepository;
        this.engineeringCourseRepository = engineeringCourseRepository;
    }

    public CourseExcelService() {
    }

    public EngineeringCourseRepository engineeringCourseRepository;

    public void store(MultipartFile file, int collegeCode) {
        if (collegeCode == 1) {
            try {
                List<Courses> lstCustomers = CoursesExcelUtilities.parseExcelFile(file.getInputStream());
                List<EngineeringCourses> lst = new ArrayList<>();
                for (Courses courses : lstCustomers) {
                    EngineeringCourses engineeringCourses = new EngineeringCourses();
                    engineeringCourses.setCourse(courses.getCourse());
                    engineeringCourses.setId(courses.getId());
                    engineeringCourses.setCollegeTypeId(courses.getCollegeTypeId());
                    lst.add(engineeringCourses);
                }
                // Save Customers to DataBase
                engineeringCourseRepository.saveAll(lst);
            } catch (IOException e) {
                throw new RuntimeException("FAIL! -> message = " + e.getMessage());
            }
        } else if (collegeCode == 2) {
            try {
                List<Courses> lstCustomers = CoursesExcelUtilities.parseExcelFile(file.getInputStream());
                List<ArtsCourses> lst = new ArrayList<>();
                for (Courses courses : lstCustomers) {
                    ArtsCourses artsCourses = new ArtsCourses();
                    artsCourses.setCourse(courses.getCourse());
                    artsCourses.setId(courses.getId());
                    artsCourses.setCollegeTypeId(courses.getCollegeTypeId());
                    lst.add(artsCourses);
                }
                // Save Customers to DataBase
                artsCourseRepository.saveAll(lst);
            } catch (IOException e) {
                throw new RuntimeException("FAIL! -> message = " + e.getMessage());
            }
        } else if (collegeCode == 3) {
            try {
                List<Courses> lstCustomers = CoursesExcelUtilities.parseExcelFile(file.getInputStream());
                List<MedicalCourses> lst = new ArrayList<>();
                for (Courses courses : lstCustomers) {
                    MedicalCourses medicalCourses = new MedicalCourses();
                    medicalCourses.setCourse(courses.getCourse());
                    medicalCourses.setId(courses.getId());
                    medicalCourses.setCollegeTypeId(courses.getCollegeTypeId());
                    lst.add(medicalCourses);
                }
                // Save Customers to DataBase
                medicalCoursesRepository.saveAll(lst);
            } catch (IOException e) {
                throw new RuntimeException("FAIL! -> message = " + e.getMessage());
            }
        } else if (collegeCode == 4) {

            try {
                List<Courses> lstCustomers = CoursesExcelUtilities.parseExcelFile(file.getInputStream());
                List<AgriCourses> lst = new ArrayList<>();
                for (Courses courses : lstCustomers) {
                    AgriCourses agriCourses = new AgriCourses();
                    agriCourses.setCourse(courses.getCourse());
                    agriCourses.setId(courses.getId());
                    agriCourses.setCollegeTypeId(courses.getCollegeTypeId());
                    lst.add(agriCourses);
                }
                // Save Customers to DataBase
                agriCoursesRepository.saveAll(lst);
            } catch (IOException e) {
                throw new RuntimeException("FAIL! -> message = " + e.getMessage());
            }
        }
    }

//    // Load Data to Excel File
//    public ByteArrayInputStream loadFile() {
//        List<Courses> customers = (List<Courses>) repo.findAll();
//
//        try {
//            return CoursesExcelUtilities.coursesToExcel(customers);
//        } catch (IOException e) {}
//
//        return null;
//    }
}
