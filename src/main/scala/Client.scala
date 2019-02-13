// Simple client
import java.net._
import java.io._
import scala.io._

object Client {
  def main(args: Array[String]): Unit = {

//    val s = new Socket("192.168.1.15",2076)
    val s = new Socket("185.98.222.147",11164)
    lazy val in = new BufferedSource(s.getInputStream()).getLines()
    val out = new PrintStream(s.getOutputStream())
    out.println("Hello, world")
    out.flush()
    println("Received: " + in.next())
    s.close()
  }
}
