addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.3.3")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.3")

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")

/**
  * ScalaJS sbt plugin
  *
  * @see http://www.scala-js.org/
  */

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.13")


/**
  * sbt dependency graph sugar
  *
  * for drawing a dependency tree
  * @see https://github.com/gilt/sbt-dependency-graph-sugar
  */
addSbtPlugin("com.gilt" % "sbt-dependency-graph-sugar" % "0.7.5-1")

/**
  * scala-style
  *
  * for Scala style checking
  * @see http://www.scalastyle.org/
  */
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")


/**
  * coursier
  *
  * better ivy alternative for dependency resolution
  * @see https://github.com/alexarchambault/coursier
  */
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M14-2")

/**
  * sbt-updates
  *
  * for easier dependency updates monitoring
  * @see https://github.com/rtimush/sbt-updates
  */
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.2.0")
