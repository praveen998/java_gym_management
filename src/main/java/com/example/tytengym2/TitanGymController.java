package com.example.tytengym2;

import java.util.*;

import javax.swing.text.html.parser.Entity;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.tytengym2.models.Address;
import com.example.tytengym2.models.Enrolls_to;
import com.example.tytengym2.models.Users;
import com.example.tytengym2.repository.AdressRepo;
import com.example.tytengym2.repository.Enrolls_to_Repo;
import com.example.tytengym2.repository.UsersRepo;
import com.example.tytengym2.service.DashboardService;

import org.springframework.ui.Model;
import java.time.LocalDate;




@RestController
public class TitanGymController
 {
  @Autowired
  private UsersRepo usersRepo;
  @Autowired
  private AdressRepo adressRepo;

  @Autowired
  private DashboardService dashboardService;

    @RequestMapping("/")
    public ModelAndView index()

    {
      //dashboardService.toatalPlan();
     

      ModelAndView modelAndView=new ModelAndView();
      modelAndView.setViewName("home.html");
      return modelAndView;

    }


    @RequestMapping("/dashboard")
    public String dashboard()
    {

      return "hello,praveen,nice,meet";
    }

    @RequestMapping("/new_registration")
    public ResponseEntity<String> registration(
        @RequestParam("name") String name,
        @RequestParam("streetname") String streetname,
        @RequestParam("city") String city,
        @RequestParam("state") String state,
        @RequestParam("zipcode") String zipcode,
        @RequestParam("email") String email,
        @RequestParam("phone") String phone,
        @RequestParam("dob") String dob,
        @RequestParam("gender") String gender,
        @RequestParam("doj") String doj
    ) 
    {
        try {
          System.out.println(doj);
          LocalDate date = LocalDate.parse(doj);
          System.out.println(date.getMonthValue());


            Users users = new Users();
            users.setUsername(name);
            users.setEmail(email);
            users.setDob(dob);
            users.setGender(gender);
            users.setJoining_date(doj);
            users.setJoining_month(Integer.toString(date.getMonthValue()));
            users.setMobile(phone);
            usersRepo.save(users);

            Long id=usersRepo.findByEmail(name,email);

    
            Address address = new Address();
            address.setUsers(users);
            address.setCity(city);
            address.setState(state);
            address.setStreetName(streetname);
            address.setZipcode(zipcode);
            adressRepo.save(address);
    
            return new ResponseEntity<>("New Registration successful with memberid:"+" "+id, HttpStatus.CREATED);
        } catch (Exception e) {
            // Handle the exception and return an appropriate response
            return new ResponseEntity<>("Registration failed: " , HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping("/payment")
    public ResponseEntity<String> payment(
      @RequestParam("membershipid") String membershipid,
      @RequestParam("Name") String Name,
      @RequestParam("plan") String plan
      )
    {
         System.out.println(membershipid);
         System.out.println(Name);
         System.out.println(plan);

       return new ResponseEntity<String>("New payment successful",HttpStatus.CREATED);
    }

    @RequestMapping("/edit_members")
    public ResponseEntity<String> edit_members(@RequestParam("membershipid") String membershipid)
    {
      return new ResponseEntity<String>("New payment successful",HttpStatus.CREATED);
    }
    

    @RequestMapping("/health_status")
    public ResponseEntity<String> health_status(@RequestParam("membershipid") String membershipid)
    {
      return new ResponseEntity<String>("New payment successful",HttpStatus.CREATED);
    }

     
    @RequestMapping("/create_plan")
    public ResponseEntity<String> create_plan(@RequestParam("planname") String planname,@RequestParam("plandescription") String plandescription,
    @RequestParam("planvalidity") String planvalidity,@RequestParam("planamount") String planamount)
    {
      return new ResponseEntity<String>("New payment successful",HttpStatus.CREATED);
    }


    
    @RequestMapping("/overview")
    public ResponseEntity<String> overview(@RequestParam("date") String date)
    {
      return new ResponseEntity<String>("New payment successful",HttpStatus.CREATED);
    }


  }
    
  /*  @PostMapping("/sendMessage")
    @ResponseBody
    public  ResponseEntity<String> sendMessage(@RequestBody String e ,String name,String email,String subject,String message)
    {
        
   
       Messages mess=new Messages(name, email, subject, message);

       messageService.addMessages(mess);
        return ResponseEntity.status(HttpStatus.OK)
        .contentType(MediaType.TEXT_PLAIN)
        .body(name);
    }*/
   

