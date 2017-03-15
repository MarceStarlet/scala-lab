package com.marcestarlet.basics

/**
 * Extending from the trait scala.App we quickly turn objects into
 * executable programs since App implements the main method and our objects
 * are extending it.
 */
object HelloWorldApp extends App {
  // if we extends from the trait App all statements will be executed
  println("Hello World App!")
}
