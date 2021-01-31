name := "UT-IT Assignment"
version := "1.0"
scalaVersion := "2.12.12"


lazy val UT = (project in file("UT")).settings(

        libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.2" % "test"
 )



lazy val IT = (project in file("IT")).settings(

        libraryDependencies ++= Seq("org.scalatest" %% "scalatest-flatspec" % "3.2.2" % "test",
  "org.mockito" %% "mockito-scala" % "1.16.15" % Test)

 )

lazy val root = (project in file(".")).aggregate(UT, IT)





