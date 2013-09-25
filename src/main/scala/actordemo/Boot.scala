package actordemo

import akka.actor.{Props, ActorSystem}
import com.typesafe.config.ConfigFactory

/**
 * hello2akka
 *
 * User: Alexandros Bantis
 * Date: 9/7/13
 * Time: 10:14 AM
 */
object Boot extends App {
  import ShoppingSpree._

  val config = ConfigFactory.load()
  implicit val system = ActorSystem("ActorDemo", config.getConfig("hello2akka"))

  val bank = system.actorOf(Props[BankAccount], "bankOfAkka")
  val shoppingSpree = system.actorOf(Props(classOf[ShoppingSpree], bank), "ShoppingSpree")

  shoppingSpree ! PartyTime
}
