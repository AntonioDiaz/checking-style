package com.adiaz.mycheckstyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public enum HelloCheckstyleApplication {
  ;

  /**
   * testMethod's javado
   *
   * @param args testg.
   */
  public static void main(String[] args) {
    System.out.println(
        "d      ©√√[INFO] You have 0 Checkstyle violations.[INFO] You have 0 "
            + "Checkstyle violations.[INFO] You have 0 Checkstyle violations.[INFO] "
            + "You "
            + "have 0 Checkstyle violations.                                                   ");
    SpringApplication.run(HelloCheckstyleApplication.class, args);
  }

}