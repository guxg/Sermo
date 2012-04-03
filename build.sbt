name := "sermo"

scalaVersion := "2.8.1"

scalacOptions += "-deprecation"

seq(webSettings :_*)

// If using JRebel
scanDirectories in Compile := Nil

logLevel := Level.Info

EclipseKeys.withSource := true

libraryDependencies ++= {
  val liftVersion = "2.4"
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default"  withSources(),
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default"  withSources(),
    "net.liftweb" %% "lift-widgets" % liftVersion % "compile->default"  withSources(),
    "net.liftweb" %% "lift-json" % liftVersion % "compile->default"  withSources(),
    "net.liftweb" %% "lift-util" % liftVersion % "compile->default"  withSources(),
    "net.liftweb" %% "lift-actor" % liftVersion % "compile->default"  withSources(),
    "net.liftweb" %% "lift-textile" % liftVersion % "compile->default"  withSources(),
    "net.liftweb" %% "lift-testkit" % liftVersion % "compile->default"  withSources(),
    "name.guxg.webkit" %% "bootstrap" % (liftVersion + "-0.1") 
  )
}

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "1.6.2"  withSources(),
  "junit" % "junit" % "4.5" % "test->default",
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "container,test",
  "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
  "com.h2database" % "h2" % "1.2.138",
  "postgresql" % "postgresql" % "9.0-801.jdbc4",
  "org.scala-tools.testing" %% "specs" % "1.6.6" % "test->default",
  //"ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default"
  "org.slf4j" % "slf4j-api" % "1.6.1" % "compile->default",
  "org.slf4j" % "slf4j-log4j12" % "1.6.1" % "compile->default",
   "log4j" % "log4j" % "1.2.16" % "compile->default"
)

resolvers ++= Seq(
    "apache.repo" at "https://repository.apache.org/content/repositories/snapshots/",
    "sonatype.repo" at "https://oss.sonatype.org/content/repositories/public/"
)

libraryDependencies += "eu.getintheloop" %% "lift-shiro" % "0.0.5" withSources()
