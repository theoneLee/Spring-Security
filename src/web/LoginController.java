package web;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Lee on 2017/4/5 0005.
 */
@Controller
public class LoginController {

//    @RequestMapping(value = "/login",method = RequestMethod.POST)
//    public String login(@Validated User user, Errors errors){
//        if (user.getUsername().equals("admin")&&user.getPassword().equals("root")){
//            return "home";
//        }else {
//
//        }
//        if (errors.hasErrors()){
//            return "login";
//        }
//        return "login";
//    }

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginView(Model model){//在login.jsp里是使用spring提供的表单，开启了csrf功能
        model.addAttribute(new User());
        return "login";
    }
}
