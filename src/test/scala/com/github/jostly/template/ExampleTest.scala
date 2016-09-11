package com.github.jostly.template

import org.scalatest.FunSuite

class ExampleTest extends FunSuite {
  val e = new Example

  test("adding") {
    assert(e.add(1, 2) === 3)
  }

  test("info") {
    assert(e.info === "template-sbt-travis")
  }

}
