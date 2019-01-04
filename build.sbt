organization := "se.sisyfosdigital.sbt"
description in ThisBuild := "Allows eslint to be used from within sbt."
licenses in ThisBuild += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

resolvers += Resolver.typesafeRepo("releases")

addSbtJsEngine("1.2.2")
addSbtWeb("1.4.3")

name := "sbt-eslint"

sbtPlugin := true
publishMavenStyle := false
bintrayRepository := "sbt-plugins"
bintrayOrganization := None
