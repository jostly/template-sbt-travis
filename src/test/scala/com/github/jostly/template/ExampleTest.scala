package com.github.jostly.template

import org.scalatest.FunSuite

class ExampleTest extends FunSuite {

  test("adding") {
    val e = new Example
    assert(e.add(1, 2) === 3)
  }

}
