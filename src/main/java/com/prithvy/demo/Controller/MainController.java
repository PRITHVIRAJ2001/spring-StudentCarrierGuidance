package com.prithvy.demo.Controller;

import com.prithvy.demo.Utilities.Service.CollegeExcelService;
import com.prithvy.demo.Utilities.Service.CourseExcelService;
import com.prithvy.demo.Utilities.Service.JobExcelService;
import com.prithvy.demo.model.*;
import com.prithvy.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
@Component("com.prithvy.demo.Controller.MainController")
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private EngineeringCourseService engineeringCourseService;

    @Autowired
    private ArtsCourseService artsCourseService;

    @Autowired
    private MedicalCoursesService medicalCourseService;

    @Autowired
    private AgriCoursesService agriCourseService;


    @Autowired
    private EngineeringCourses engCourses;
    @Autowired
    private EngineeringCollege engineeringCollege;
    @Autowired
    private ArtsCollege artsCollege;
    @Autowired
    private MedicalCollege medicalCollege;
    @Autowired
    private AgriCollege agriCollege;

    @Autowired
    private EngineeringCollegeService engineeringCollegeService;


    @Autowired
    private CollegeTypesService collegeTypesService;


    @Autowired
    private ArtsCollegeService artsCollegeService;


    @Autowired
    private AgriCollegeService agriCollegeService;


    @Autowired
    private MedicalCollegeService medicalCollegeService;


    @Autowired
    private EngineeringReviewModelService engineeringReviewModelService;

    @Autowired
    private ArtsReviewService artsReviewService;


    @Autowired
    private MedicalReviewService medicalReviewService;

    @Autowired
    private AgriReviewService agriReviewService;

    @Autowired
    private EngineeringJobsService engineeringJobsService;


    @Autowired
    private ArtsJobsService artsJobsService;


    @Autowired
    private MedicalJobsService medicalJobsService;


    @Autowired
    private AgriJobsService agriJobsService;

    @Autowired
    private CollegeExcelService collegeExcelService;

    @Autowired
    private CourseExcelService courseExcelService;

    @Autowired
    private JobExcelService jobExcelService;

    public MainController() {

    }

    public MainController(UserService userService, EngineeringCourseService engineeringCourseService,
                          ArtsCourseService artsCourseService, MedicalCoursesService medicalCourseService,
                          AgriCoursesService agriCourseService, EngineeringCourses engCourses,
                          EngineeringCollege engineeringCollege, ArtsCollege artsCollege, MedicalCollege medicalCollege,
                          AgriCollege agriCollege, EngineeringCollegeService engineeringCollegeService,
                          CollegeTypesService collegeTypesService, ArtsCollegeService artsCollegeService,
                          AgriCollegeService agriCollegeService, MedicalCollegeService medicalCollegeService,
                          EngineeringReviewModelService engineeringReviewModelService, ArtsReviewService artsReviewService,
                          MedicalReviewService medicalReviewService, AgriReviewService agriReviewService,
                          EngineeringJobsService engineeringJobsService, ArtsJobsService artsJobsService,
                          MedicalJobsService medicalJobsService, AgriJobsService agriJobsService,
                          CollegeExcelService collegeExcelService, CourseExcelService courseExcelService,
                          JobExcelService jobExcelService) {
        this.userService = userService;
        this.engineeringCourseService = engineeringCourseService;
        this.artsCourseService = artsCourseService;
        this.medicalCourseService = medicalCourseService;
        this.agriCourseService = agriCourseService;
        this.engCourses = engCourses;
        this.engineeringCollege = engineeringCollege;
        this.artsCollege = artsCollege;
        this.medicalCollege = medicalCollege;
        this.agriCollege = agriCollege;
        this.engineeringCollegeService = engineeringCollegeService;
        this.collegeTypesService = collegeTypesService;
        this.artsCollegeService = artsCollegeService;
        this.agriCollegeService = agriCollegeService;
        this.medicalCollegeService = medicalCollegeService;
        this.engineeringReviewModelService = engineeringReviewModelService;
        this.artsReviewService = artsReviewService;
        this.medicalReviewService = medicalReviewService;
        this.agriReviewService = agriReviewService;
        this.engineeringJobsService = engineeringJobsService;
        this.artsJobsService = artsJobsService;
        this.medicalJobsService = medicalJobsService;
        this.agriJobsService = agriJobsService;
        this.collegeExcelService = collegeExcelService;
        this.courseExcelService = courseExcelService;
        this.jobExcelService = jobExcelService;
    }

    @RequestMapping("/")
    public String home(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_HOME");
        return "home.jsp";
    }

    @RequestMapping("/review")
    public String reviews() {
        return "review.jsp";
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_REGISTER");
        return "register.jsp";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_LOGIN");
        return "login.jsp";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_LOGOUT");
        return "logout.jsp";
    }


    @RequestMapping("/save-user")
    public String registerUser(@ModelAttribute User user, HttpServletRequest request) {
        if (user.getPassword().equals(user.getConfirmpassword())) {
            userService.saveMyUser(user);
            request.setAttribute("mode", "MODE_HOME");
            return "home.jsp";
        } else {
            request.setAttribute("mode", "MODE_REGISTER");
            request.setAttribute("error", "Invalid Username or Password");
            return "register.jsp";
        }


    }

    @RequestMapping("/4cols")
    public String allColleges(HttpServletRequest request) {
        request.setAttribute("mode", "FOR_COLLEGES");

        return "view.jsp";
    }

    @RequestMapping("/collegetypes")
    public String collegetypes(ModelMap modelMap) {
        modelMap.put("types", collegeTypesService.findAll());
        return "collegetypes.jsp";
    }


    @RequestMapping("/login-user")
    public String loginUser(@ModelAttribute User user, HttpServletRequest request) {
        if (userService.findByEmailAndPassword(user.getEmail(), user.getPassword()) != null) {
            request.setAttribute("mode", "MODE_HOME");
            return "collegetypes";
        } else {
            request.setAttribute("error", "Invalid Username or Password");
            request.setAttribute("mode", "MODE_LOGIN");
            return "login.jsp";
        }

    }

    @RequestMapping("/engineering")
    public String engineering(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "ENG");
        modelMap.put("eng", engineeringCollegeService.findAll());
        System.out.println(engineeringCollegeService.findAll());
        return "colleges.jsp";
    }

    @RequestMapping("/agri")
    public String agri(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "AGRI");
        modelMap.put("agri", agriCollegeService.findAll());
        System.out.println(agriCollegeService.findAll());
        return "colleges.jsp";
    }

    @RequestMapping("/arts")
    public String arts(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "ARTS");
        modelMap.put("arts", artsCollegeService.findAll());
        System.out.println(artsCollegeService.findAll());
        return "colleges.jsp";
    }

    @RequestMapping("/medical")
    public String medical(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "MED");
        modelMap.put("med", medicalCollegeService.findAll());
        System.out.println(medicalCollegeService.findAll());
        return "colleges.jsp";
    }


    @RequestMapping("/view")
    public String findallTypes(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "FOR_COURSES");
        modelMap.put("types", collegeTypesService.findAll());
        System.out.println(collegeTypesService.findAll());
        return "view.jsp";
    }


    @RequestMapping("/findAllEngineeringColleges")
    public String findAllEng(@ModelAttribute EngineeringCollege eng, ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "ENG");
        modelMap.put("eng", engineeringCollegeService.findAllByDistrict(eng.getDistrict()));
        System.out.println(engineeringCollegeService.findAllByDistrict(eng.getDistrict()));
        return "colleges.jsp";

    }


    @RequestMapping("/findArtswithDistrict")
    public String findArtswithDistrict(@ModelAttribute ArtsCollege arts, ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "ARTS");
        modelMap.put("arts", artsCollegeService.findAllByDistrict(arts.getDistrict()));
        System.out.println(artsCollegeService.findAllByDistrict(arts.getDistrict()));
        return "colleges.jsp";
    }


    @RequestMapping("/findMedwithDistrict")
    public String findMedicalwithDistrict(@ModelAttribute MedicalCollege med, ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "MED");
        modelMap.put("med", medicalCollegeService.findAllByDistrict(med.getDistrict()));
        System.out.println(medicalCollegeService.findAllByDistrict(med.getDistrict()));
        return "colleges.jsp";
    }

    @RequestMapping("/findAgriwithDistrict")
    public String findAgriwithDistrict(@ModelAttribute AgriCollege agri, ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "AGRI");
        modelMap.put("agri", agriCollegeService.findAllByDistrict(agri.getDistrict()));
        System.out.println(agriCollegeService.findAllByDistrict(agri.getDistrict()));
        return "colleges.jsp";
    }


    @RequestMapping("/engineeringcollegeReviewHome")
    public String showEng_Home(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_ENG1");
        modelMap.put("Ecol", engineeringCollegeService.findAll());
        return "homeReview.jsp";
    }

    @RequestMapping("/EngineeringSaveReview")
    public String showEng_SaveReview(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_ENG1");
        return "SaveReview.jsp";
    }

    @RequestMapping("/addReviewForEngineeringCollege")
    public String addEngineeringReview(@RequestParam("collegename") String collegename, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_ENG1");
        engineeringCollege = engineeringCollegeService.findByCollegename(collegename);
        System.out.println(engineeringCollege.getId());
        return "SaveReview.jsp";
    }

    @RequestMapping("/showReviewForEngineeringCollege")
    public String showEngineeringCollegeReview(HttpServletRequest request, @ModelAttribute EngineeringReviewModel engineeringReviewModel, @ModelAttribute EngineeringCollege engineeringCollege, @RequestParam("collegename") String collegename, ModelMap modelMap) {
        request.setAttribute("mode", "MODE_ENG1");
        engineeringCollege = engineeringCollegeService.findByCollegename(collegename);
        Long id = engineeringCollege.getId();
        modelMap.put("Emod", engineeringReviewModelService.findAllByCollegeId(id));
        return "ShowReview.jsp";
    }

    @RequestMapping("/save-EngineeringReview")
    public String saveEngineeringReview(HttpServletRequest request, @ModelAttribute EngineeringReviewModel engineeringReviewModel, ModelMap modelMap) {
        request.setAttribute("mode", "MODE_ENG1");
        engineeringReviewModel.setCollegeId(engineeringCollege.getId());
        engineeringReviewModelService.saveMyReview(engineeringReviewModel);
        return "/engineeringcollegeReviewHome";
    }

    @RequestMapping("/EngineeringShowReview")
    public String showEngineeringReview(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_ENG1");
        return "ShowReview.jsp";
    }


    @RequestMapping("/agricollegeReviewHome")
    public String showAgri_Home(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_AGRI1");
        modelMap.put("Agricol", agriCollegeService.findAll());
        return "homeReview.jsp";
    }

    @RequestMapping("/AgriSaveReview")
    public String showAgri_SaveReview(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_AGRI1");
        return "SaveReview.jsp";
    }

    @RequestMapping("/addReviewForAgriCollege")
    public String addAgriReview(@RequestParam("collegename") String collegename, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_AGRI1");
        agriCollege = agriCollegeService.findByCollegename(collegename);
        System.out.println(agriCollege.getId());
        return "SaveReview.jsp";
    }

    @RequestMapping("/showReviewForAgriCollege")
    public String showAgriCollegeReview(HttpServletRequest request, @ModelAttribute AgriReviewModel agriReviewModel, @ModelAttribute AgriCollege agriCollege, @RequestParam("collegename") String collegename, ModelMap modelMap) {
        request.setAttribute("mode", "MODE_AGRI1");
        agriCollege = agriCollegeService.findByCollegename(collegename);
        Long id = agriCollege.getId();
        modelMap.put("Agricol", agriReviewService.findAllByCollegeId(id));
        return "ShowReview.jsp";
    }

    @RequestMapping("/save-AgriReview")
    public String saveAgriReview(HttpServletRequest request, @ModelAttribute AgriReviewModel agriReviewModel, ModelMap modelMap) {
        request.setAttribute("mode", "MODE_AGRI1");
        agriReviewModel.setCollegeId(agriCollege.getId());
        agriReviewService.saveMyReview(agriReviewModel);
        return "/agricollegeReviewHome";
    }

    @RequestMapping("/AgriShowReview")
    public String showAgriReview(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_AGRI1");
        return "ShowReview.jsp";
    }


    @RequestMapping("/artscollegeReviewHome")
    public String showArts_Home(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_ARTS1");
        modelMap.put("Artscol", artsCollegeService.findAll());
        return "homeReview.jsp";
    }

    @RequestMapping("/ArtsSaveReview")
    public String showArts_SaveReview(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_ARTS1");
        return "SaveReview.jsp";
    }

    @RequestMapping("/addReviewForArtsCollege")
    public String addArtsReview(HttpServletRequest request, @RequestParam("collegename") String collegename) {
        request.setAttribute("mode", "MODE_ARTS1");
        artsCollege = artsCollegeService.findByCollegename(collegename);
        System.out.println(artsCollege.getId());
        return "SaveReview.jsp";
    }

    @RequestMapping("/showReviewForArtsCollege")
    public String showArtsCollegeReview(HttpServletRequest request, @ModelAttribute ArtsReviewModel artsReviewModel, @ModelAttribute ArtsCollege artsCollege, @RequestParam("collegename") String collegename, ModelMap modelMap) {
        request.setAttribute("mode", "MODE_ARTS1");
        artsCollege = artsCollegeService.findByCollegename(collegename);
        Long id = artsCollege.getId();
        modelMap.put("Artscol", artsReviewService.findAllByCollegeId(id));
        return "ShowReview.jsp";
    }

    @RequestMapping("/save-ArtsReview")
    public String saveArtsReview(HttpServletRequest request, @ModelAttribute ArtsReviewModel artsReviewModel, ModelMap modelMap) {
        request.setAttribute("mode", "MODE_ARTS1");
        artsReviewModel.setCollegeId(artsCollege.getId());
        artsReviewService.saveMyReview(artsReviewModel);
        return "/artscollegeReviewHome";
    }

    @RequestMapping("/ArtsShowReview")
    public String showArtsReview(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_ARTS1");
        return "ShowReview.jsp";
    }


    @RequestMapping("/medicalcollegeReviewHome")
    public String showMedical_Home(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_MEDICAL1");
        modelMap.put("Medicol", medicalCollegeService.findAll());
        return "homeReview.jsp";
    }

    @RequestMapping("/MedicalSaveReview")
    public String showMedical_SaveReview(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_MEDICAL1");
        return "SaveReview.jsp";
    }

    @RequestMapping("/addReviewForMedicalCollege")
    public String addMedicalReview(HttpServletRequest request, @RequestParam("collegename") String collegename) {
        request.setAttribute("mode", "MODE_MEDICAL1");
        medicalCollege = medicalCollegeService.findByCollegename(collegename);
        System.out.println(medicalCollege.getId());
        return "SaveReview.jsp";
    }

    @RequestMapping("/showReviewForMedicalCollege")
    public String showMedicalCollegeReview(HttpServletRequest request, @ModelAttribute MedicalReviewModel medicalReviewModel, @ModelAttribute MedicalCollege medicalCollege, @RequestParam("collegename") String collegename, ModelMap modelMap) {
        request.setAttribute("mode", "MODE_MEDICAL1");
        medicalCollege = medicalCollegeService.findByCollegename(collegename);
        Long id = medicalCollege.getId();
        modelMap.put("Medicol", medicalReviewService.findAllByCollegeId(id));
        return "ShowReview.jsp";
    }

    @RequestMapping("/save-medicalReview")
    public String saveMedicalReview(HttpServletRequest request, @ModelAttribute MedicalReviewModel medicalReviewModel, ModelMap modelMap) {
        request.setAttribute("mode", "MODE_MEDICAL1");
        medicalReviewModel.setCollegeId(medicalCollege.getId());
        medicalReviewService.saveMyReview(medicalReviewModel);
        return "/medicalcollegeReviewHome";
    }

    @RequestMapping("/MedicalShowReview")
    public String showMedicalReview(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_MEDICAL1");
        return "ShowReview.jsp";
    }

    @RequestMapping("/engineeringcollegeCourses")
    public String showEngineeringCourses(@ModelAttribute CollegeTypes types, ModelMap modelmap, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_ENG1");
        modelmap.put("EngCourses", engineeringCourseService.findAll());
        return "collegeCourses.jsp";

    }

    @RequestMapping("/artscollegeCourses")
    public String showArtsCourses(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_ARTS1");
        modelMap.put("ArtsCourses", artsCourseService.findAll());
        return "collegeCourses.jsp";
    }


    @RequestMapping("/medicalcollegeCourses")
    public String showMedicalCourses(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_MEDICAL1");
        modelMap.put("MedicalCourses", medicalCourseService.findAll());
        return "collegeCourses.jsp";
    }

    @RequestMapping("/agricollegeCourses")
    public String showAgriCourses(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_AGRI1");
        modelMap.put("AgriCourses", agriCourseService.findAll());
        return "collegeCourses.jsp";
    }


    @RequestMapping("/engCourseJobs")
    public String showJobsForParticularEngCourse(HttpServletRequest request, ModelMap modelMap, @RequestParam("course") String course, @ModelAttribute EngineeringCourses engCourses) {
        request.setAttribute("mode", "MODE_ENG");
        engCourses = engineeringCourseService.findByCourse(course);
        Long id = engCourses.getId();
        modelMap.put("engJob", engineeringJobsService.findAllByCourseId(id));
        return "Jobs.jsp";
    }


    @RequestMapping("/artsCourseJobs")
    public String showJobsForParticularArtsCourse(HttpServletRequest request, @ModelAttribute ArtsCourses artsCourses, ModelMap modelMap, @RequestParam("course") String course) {
        request.setAttribute("mode", "MODE_ARTS");
        artsCourses = artsCourseService.findByCourse(course);
        Long id = artsCourses.getId();
        modelMap.put("artsJob", artsJobsService.findAllByCourseId(id));
        return "Jobs.jsp";
    }


    @RequestMapping("/agriCourseJobs")
    public String showJobsForParticularAgriCourse(HttpServletRequest request, @RequestParam("course") String course, @ModelAttribute AgriCourses agriCourses, ModelMap modelMap) {
        request.setAttribute("mode", "MODE_AGRI");
        agriCourses = agriCourseService.findByCourse(course);
        modelMap.put("agriJob", agriJobsService.findAllByCourseId(agriCourses.getId()));
        return "Jobs.jsp";
    }


    @RequestMapping("/medicalCourseJobs")
    public String showJobsForParticularMedicalCourse(HttpServletRequest request, @RequestParam("course") String course, @ModelAttribute MedicalCourses medicalCourse, ModelMap modelMap) {
        request.setAttribute("mode", "MODE_MEDICAL");
        medicalCourse = medicalCourseService.findByCourse(course);
        modelMap.put("medicalJob", medicalJobsService.findAllByCourseId(medicalCourse.getId()));
        return "Jobs.jsp";
    }


    @RequestMapping("/allCourses")
    public String allCoursesForJobs(HttpServletRequest request, ModelMap modelMap) {
        request.setAttribute("mode", "FOR_JOBS");
        modelMap.put("types", collegeTypesService.findAll());
        return "view.jsp";
    }


    @RequestMapping("/allengineeringcollegeCourses")
    public String showallEngineeringCourses(@ModelAttribute CollegeTypes types, ModelMap modelmap, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_ENG1");
        modelmap.put("EngCourses", engineeringCourseService.findAll());
        return "allCourses.jsp";

    }

    @RequestMapping("/allartscollegeCourses")
    public String showallArtsCourses(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_ARTS1");
        modelMap.put("ArtsCourses", artsCourseService.findAll());
        return "allCourses.jsp";
    }


    @RequestMapping("/allmedicalcollegeCourses")
    public String showallMedicalCourses(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_MEDICAL1");
        modelMap.put("MedicalCourses", medicalCourseService.findAll());
        return "allCourses.jsp";
    }

    @RequestMapping("/allagricollegeCourses")
    public String showallAgriCourses(ModelMap modelMap, HttpServletRequest request) {
        request.setAttribute("mode", "MODE_AGRI1");
        modelMap.put("AgriCourses", agriCourseService.findAll());
        return "allCourses.jsp";
    }
}

