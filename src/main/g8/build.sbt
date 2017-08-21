lazy val root = (project in file("."))
  .enablePlugins(Angulate2BundlingPlugin)
  .settings(
    inThisBuild(List(
      version      := "0.1.0",
      organization := "com.example",
      scalaVersion := "2.11.11"
    )),
    name := "angulate2-seed",
    ngBootstrap := Some("AppModule")
  )
