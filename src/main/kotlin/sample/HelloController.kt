package sample

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

//追加
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestParam

@Controller
public class HelloController {
    @RequestMapping("/send")
    fun send( model:Model, @RequestParam("name")  name:String) :String{
      model.addAttribute("name", name)
      return "hello"    // View file is templates/hello.html
    }
    @RequestMapping("/hello")
    fun hello(model: Model) :String{
      model.addAttribute("name", "直接、URIが入力されました。")
      return "hello"
    }

    @RequestMapping("/")
    fun home() = "index"

}
