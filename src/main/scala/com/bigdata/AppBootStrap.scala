package com.bigdata

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AppBootStrap {

}

object AppBootStrap {
  def main(args: Array[String]):Unit ={
    SpringApplication.run(classOf[AppBootStrap])
  }
}
