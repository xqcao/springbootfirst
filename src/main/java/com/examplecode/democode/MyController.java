package com.examplecode.democode;

import com.examplecode.democode.modules.OneStatus;
import com.examplecode.democode.services.StatusService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

  @Autowired
  StatusService statusService;

  @GetMapping("/sayit")
  public String sayHi(){
    return "hello";
  }

  @GetMapping("/status")
  public OneStatus getST(){
    return statusService.getOneServiceStatus();
  }
  @PostMapping("/postbody")
  public String sayBye(@RequestBody String bb){
    return "hi "+bb+", and have a nice day ";
  }
}
