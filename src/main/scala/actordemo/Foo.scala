package actordemo

import akka.actor.Actor

/**
 * Foo
 * User: Alexandros Bantis
 * Date: 9/10/13
 * Time: 10:51 PM
 */
class Foo(var x: Int) extends Actor {
  import Foo._
  def receive = {
    case WhatIsX => sender ! x
  }
}
object Foo {
  object WhatIsX
}
