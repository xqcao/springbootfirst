package com.examplecode.democode.services;

import com.examplecode.democode.modules.OneStatus;

import org.springframework.stereotype.Service;

@Service
public class StatusService {
  public OneStatus getOneServiceStatus(){
    OneStatus one = new OneStatus();
    one.setStatus("status");
    one.setVersion("1.0.0");
    return one;
  }
}
