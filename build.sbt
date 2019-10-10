import sbtcrossproject.CrossPlugin.autoImport.{CrossType, crossProject}

lazy val sandbox = crossProject(JVMPlatform, JSPlatform)
  .crossType(CrossType.Pure)
  .in(file("sandbox"))
  .jsSettings(
    scalaJSUseMainModuleInitializer := true
  )

lazy val sandboxjvm = sandbox.jvm
lazy val sandboxjs = sandbox.js