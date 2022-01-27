package com.prithvy.demo.Controller;

import com.prithvy.demo.Utilities.Service.CollegeExcelService;
import com.prithvy.demo.Utilities.Service.CourseExcelService;
import com.prithvy.demo.Utilities.Service.JobExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ExcelUploadController {
	
	@Autowired
	CollegeExcelService collegeExcelService;
	
	@Autowired
	CourseExcelService courseExcelService;
	
	@Autowired
	JobExcelService jobExcelService;

    public ExcelUploadController() {
    }

    public ExcelUploadController(CollegeExcelService collegeExcelService, CourseExcelService courseExcelService, JobExcelService jobExcelService) {
        this.collegeExcelService = collegeExcelService;
        this.courseExcelService = courseExcelService;
        this.jobExcelService = jobExcelService;
    }

    @RequestMapping(value = "/uploadExcel/collegeExcel" , method = RequestMethod.POST)
    public void uploadSingleCollegeExcelFile(@RequestParam("excelfile") MultipartFile uploadfile, @RequestParam int collegeId) {
        try {
            // save file data to MongoDB
            collegeExcelService.store(uploadfile, collegeId);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @RequestMapping(value = "/uploadExcel/courseExcel",method = RequestMethod.POST)
    public void uploadSingleCourseExcelFile(@RequestParam("excelfile") MultipartFile uploadfile, @RequestParam int collegeId) {
        try {
            // save file data to MongoDB
            courseExcelService.store(uploadfile, collegeId);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @RequestMapping(value = "/uploadExcel/jobExcel",method = RequestMethod.POST)
    public void uploadSingleJobExcelFile(@RequestParam("excelfile") MultipartFile uploadfile, @RequestParam int collegeId) {
        try {
            // save file data to MongoDB
            jobExcelService.store(uploadfile, collegeId);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
