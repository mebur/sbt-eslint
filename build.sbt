organization := "se.sisyfosdigital.sbt"
description in ThisBuild := "Allows eslint to be used from within sbt."
licenses in ThisBuild += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

addSbtJsEngine("1.2.3")
addSbtWeb("1.4.4")

name := "sbt-eslint"

sbtPlugin := true
publishMavenStyle := false
bintrayRepository := "sbt-plugins"
bintrayOrganization := Some("sisyfos-digital")
