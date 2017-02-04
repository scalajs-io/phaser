Phaser.js API for Scala.js
================================
This is a Scala.js type-safe binding for [Phaser.js 2.6.2.](http://phaser.io/docs/2.6.2/)

<a name="build_requirements"></a>
#### Build Requirements

* [ScalaJs.io v0.3.x](https://github.com/ldaniels528/scalajs.io)
* [SBT v0.13.13](http://www.scala-sbt.org/download.html)

<a name="building_sdk"></a>
#### Build/publish the SDK locally

```bash
 $ sbt clean publish-local
```

<a name="resolvers"></a>
#### Resolvers

To add the Phaser.js binding to your project, add the following to your build.sbt:  

```   
resolvers += Resolver.sonatypeRepo("releases") 
```