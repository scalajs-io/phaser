// Scala.js

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.28")

// Publishing

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

// Resolvers

////addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "0.5.5")

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += Resolver.url("scala-js-snapshots", url("http://repo.scala-js.org/repo/snapshots/"))(
  Resolver.ivyStylePatterns)
