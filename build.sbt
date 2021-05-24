import org.scalajs.linker.interface.ModuleSplitStyle

// keep one of the following lines uncommented as is, the build.sbt is grepped in the
// modules/website/scala-version.js to detect the scala version

//ThisBuild / scalaVersion := ScalaVersions.v213
ThisBuild / scalaVersion := ScalaVersions.v3

lazy val basicSettings = Seq(
  scalacOptions ~= (_.filterNot(
    Set(
      "-Wdead-code",
      "-Wunused:implicits",
      "-Wunused:explicits",
      "-Wunused:imports",
      "-Wunused:params"
    )
  )),
  libraryDependencies ++= Seq(
    "com.raquo"     %%% "laminar"              % LibraryVersions.laminar,
    "io.frontroute" %%% "frontroute"           % LibraryVersions.frontroute,
    "io.laminext"   %%% "core"                 % LibraryVersions.laminext,
    "io.laminext"   %%% "markdown"             % LibraryVersions.laminext,
    "com.yurique"   %%% "embedded-files-macro" % LibraryVersions.`embedded-files-macro`
  )
)

lazy val common = project
  .in(file("modules/common"))
  .enablePlugins(ScalaJSPlugin)
  .settings(basicSettings)

lazy val module1 = project
  .in(file("modules/module1"))
  .enablePlugins(ScalaJSPlugin, EmbeddedFilesPlugin)
  .settings(basicSettings)
  .settings(
    embedTextGlobs := Seq("**/*.md"),
    (Compile / sourceGenerators) += embedFiles
  )
  .dependsOn(common)

lazy val module2 = project
  .in(file("modules/module2"))
  .enablePlugins(ScalaJSPlugin)
  .settings(basicSettings)
  .dependsOn(common)

lazy val website = project
  .in(file("modules/website"))
  .enablePlugins(ScalaJSPlugin)
  .settings(basicSettings)
  .settings(
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },
    scalaJSLinkerConfig ~= { _.withModuleSplitStyle(ModuleSplitStyle.FewestModules) },
    scalaJSLinkerConfig ~= { _.withSourceMap(false) },
    scalaJSUseMainModuleInitializer := true
  )
  .dependsOn(module1, module2)

lazy val root = project
  .in(file("."))
  .settings(
    name := "laminar-vite2-example"
  )
  .aggregate(
    website
  )
