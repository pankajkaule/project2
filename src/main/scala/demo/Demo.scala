package demo
import demo.test.Student
object Demo {
  def main(args: Array[String]): Unit = {
    println("Project is successfully started...")
    println(test.Test1.name)
    val newStudent = new Student()
    newStudent.display()
  }
}
