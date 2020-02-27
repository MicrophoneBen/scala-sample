package com.bigdata.scala

import java.util.Date

import org.springframework.web.bind.annotation.{GetMapping, RequestParam, RestController}

@RestController
class ScalaController {

  @GetMapping(Array("/scala"))
  def helloScala(@RequestParam(value = "name", defaultValue = "zhangbingquan")name : String): String ={
    val now = System.currentTimeMillis()
    println("请求耗时 ： " +  (System.currentTimeMillis() - now ))
    "现在是 ： " + new Date() + "  我是 ：" + name
  }
}
